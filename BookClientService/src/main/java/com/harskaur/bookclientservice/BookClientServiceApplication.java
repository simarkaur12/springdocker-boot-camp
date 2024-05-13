package com.harskaur.bookclientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * The main class for BookClientApplication.
 * <p>
 * It is annotated with {@code @EnableDiscoveryClient} to enable service discovery for this application.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BookClientServiceApplication {

    /**
     * The main class for BookClientApplication.
     * <p>
     * It is annotated with {@code @EnableDiscoveryClient} to enable service discovery for this application.
     */
    public static void main(String[] args) {
        SpringApplication.run(BookClientServiceApplication.class, args);
    }

}
