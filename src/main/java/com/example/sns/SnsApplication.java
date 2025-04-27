package com.example.sns;

import com.example.sns.service.DataProcessingService;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EntityScan(basePackages = "com.example.sns.model")
@EnableScheduling
//public class SnsApplication {
//    public static void main(String[] args) {
//        SpringApplication.run(SnsApplication.class, args);
//    }
//}
public class SnsApplication {
    public static void main(String[] args) {
        // Lancer l'application Spring Boot
        ApplicationContext context = SpringApplication.run(SnsApplication.class, args);

        // Récupérer le service et appeler fetchData()
        DataProcessingService dataProcessingService = context.getBean(DataProcessingService.class);
        //dataProcessingService.fetchData();
    }

    @PostConstruct
    public void init() {
        System.out.println("🏁 Application bien démarrée !");
    }
}