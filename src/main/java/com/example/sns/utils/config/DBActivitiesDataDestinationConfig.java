package com.example.sns.utils.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.*;
import org.springframework.transaction.PlatformTransactionManager;

import jakarta.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.example.sns.repository.ajout.activities", // Repositories vers BD d'ajout
        entityManagerFactoryRef = "ajoutEntityManagerFactory",
        transactionManagerRef = "ajoutTransactionManager"
)
@EntityScan(basePackages = "com.example.sns.model.ajout.activities") // Entités pour BD d'ajout
public class DBActivitiesDataDestinationConfig {

    @Bean(name = "activitiesDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.activities") // <<< correction ici
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "ajoutEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("activitiesDataSource") DataSource dataSource) {

        return builder
                .dataSource(dataSource)
                .packages("com.example.sns.model.ajout.activities") // <<< correction ici
                .persistenceUnit("ajout")
                .build();
    }

    @Bean(name = "ajoutTransactionManager")
    public PlatformTransactionManager transactionManager(
            @Qualifier("ajoutEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
