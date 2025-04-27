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
        basePackages = "com.example.sns.repository.ajout.auth",
        mongoTemplateRef = "bddestinationMongoTemplate"
)
public class MongoDBAuthDestinationConfig {

    @Value("${spring.data.mongodb.addClients.uri}")
    private String mongoUri;

    @Bean(name = "bddestinationMongoClient")
    public MongoClient bddestinationMongoClient() {
        return MongoClients.create(mongoUri);
    }

    @Bean(name = "bddestinationMongoTemplate")
    public MongoTemplate bddestinationMongoTemplate(
            @Qualifier("bddestinationMongoClient") MongoClient mongoClient,
            @Qualifier("destinationMongoConverter") MongoConverter mongoConverter) { // <<<< ajouté ici
        MongoDatabaseFactory factory = new SimpleMongoClientDatabaseFactory(mongoClient, "users");
        return new MongoTemplate(factory, mongoConverter);
    }

    @Bean(name = "destinationMongoConverter")
    public MongoConverter destinationMongoConverter(
            @Qualifier("bddestinationMongoClient") MongoClient mongoClient, // <<<< ajouté ici
            MongoMappingContext mongoMappingContext) {
        return new MappingMongoConverter(
                new DefaultDbRefResolver(new SimpleMongoClientDatabaseFactory(mongoClient, "users")),
                mongoMappingContext);
    }
}

