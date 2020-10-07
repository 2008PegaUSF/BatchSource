package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PlanetService1Application {

	public static void main(String[] args) {
		SpringApplication.run(PlanetService1Application.class, args);
	}

}
