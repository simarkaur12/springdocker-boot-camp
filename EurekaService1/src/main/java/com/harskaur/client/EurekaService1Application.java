package com.harskaur.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * The main class for ServiceOneApplication.
 * <p>
 * It is annotated with {@code @EnableDiscoveryClient} to enable service discovery for this application.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaService1Application {

	/**
	 * The {@code main} method to start the ServiceOne application.
	 *
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaService1Application.class, args);
	}

}
