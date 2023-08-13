package com.faridaliyev.microservices.currencyconversion.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.faridaliyev.microservices")
@SpringBootApplication(scanBasePackages = "com.faridaliyev.microservices")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
