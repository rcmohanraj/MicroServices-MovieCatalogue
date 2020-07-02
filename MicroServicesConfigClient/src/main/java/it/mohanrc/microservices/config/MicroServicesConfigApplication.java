package it.mohanrc.microservices.config;

import it.mohanrc.microservices.config.model.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MicroServicesConfigApplication {

//	@Bean
//	public UserData getUserData() {
//		return new UserData();
//	}

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesConfigApplication.class, args);
	}

}
