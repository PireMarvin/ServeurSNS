package com.example.sns.utils.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(
        basePackages = "com.example.sns.repository.recup.auth", // Repositories pour la BD Mongo d'ajout
        mongoTemplateRef = "bdauthMongoTemplate" // Référence à MongoTemplate pour cette connexion
)
public class MongoDBAuthConfig {

    @Value("${spring.data.mongodb.Clients.uri}")
    private String mongoUri; // Injection de l'URI depuis application.yml

    // Bean pour MongoClient avec URI de connexion
    @Bean(name = "bdauthMongoClient")
    public MongoClient bdauthMongoClient() {
        return MongoClients.create(mongoUri); // Utilisation de MongoClients.create() pour obtenir un client Mongo
    }

    // Bean pour MongoTemplate avec le client Mongo créé
    @Bean(name = "bdauthMongoTemplate")
    public MongoTemplate bdauthMongoTemplate(
            @Qualifier("bdauthMongoClient") MongoClient mongoClient,
            MongoConverter mongoConverter) {
        MongoDatabaseFactory factory = new SimpleMongoClientDatabaseFactory(mongoClient, "test");
        return new MongoTemplate(factory, mongoConverter);
    }

    // Bean pour MongoConverter
    @Bean(name = "mongoConverter")
    public MongoConverter mongoConverter(MongoMappingContext mongoMappingContext) {
        return new MappingMongoConverter(
                new DefaultDbRefResolver(new SimpleMongoClientDatabaseFactory(bdauthMongoClient(), "test")),
                mongoMappingContext);
    }
}
