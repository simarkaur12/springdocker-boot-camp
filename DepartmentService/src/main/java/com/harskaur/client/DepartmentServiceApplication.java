package com.harskaur.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * The main class for Spring Boot Application.
 * <p>
 * It is annotated with {@code @EnableDiscoveryClient} to enable service discovery for this application.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentServiceApplication {
    /**
     * The {@code main} method to start the Spring Boot application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(DepartmentServiceApplication.class, args);
    }

    // We are injecting the restTemplate() function into our application as a Bean.
    @Bean
    @LoadBalanced
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }
}