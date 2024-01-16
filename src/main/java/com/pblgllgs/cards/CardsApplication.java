package com.pblgllgs.cards;

import com.pblgllgs.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API documentation",
				description = "Here documentation of card microservice",
				version = "v1",
				contact = @Contact(
						name = "Pablo Gallegos",
						email = "pbl.gllgs@gmail.com",
						url = "https://www.pblgllgs.info"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.pblgllgs.info"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot 3",
				url = "https://spring.io/projects/spring-boot/"

		)
)
@EnableDiscoveryClient
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
