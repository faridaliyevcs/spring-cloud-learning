package com.faridaliyev.microservices.limitservice;

import com.faridaliyev.microservices.configuritaion.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = "com.faridaliyev.microservices")
@EnableConfigurationProperties(Configuration.class)
public class LimitsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceApplication.class, args);
	}

}
