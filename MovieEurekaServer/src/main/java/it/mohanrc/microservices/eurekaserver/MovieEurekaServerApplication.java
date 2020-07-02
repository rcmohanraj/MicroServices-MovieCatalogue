package it.mohanrc.microservices.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MovieEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieEurekaServerApplication.class, args);
	}

}
