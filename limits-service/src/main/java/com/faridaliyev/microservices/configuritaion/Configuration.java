package com.faridaliyev.microservices.configuritaion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties("limits-service")
public class Configuration {

    private int minimum;

    private int maximum;
}
