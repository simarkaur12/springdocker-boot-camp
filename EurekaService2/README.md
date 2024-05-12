# 3. Eureka Service Discovery using Eureka Server and 2 microservices : Service One and Service Two.
## Eureka Service Two

This application is a Eureka Client / Spring Boot microservice that serves as part of a larger application.
It is designed to be discoverable and configurable using Spring Cloud.

## Configuration

Eureka Client configuration

| Key                                  | Type    | Description                                                                                                                                                                            | Default Value |
|--------------------------------------|---------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------|
| spring.application.name              | String  | The name of the application. In this case : `ServiceTwo`                                                                                                                               |               | 
| eureka.instance.hostname	            | String  | sets the hostname for a Eureka instance. For example, to set the hostname to `localhost` in standalone mode                                                                            |               |
| eureka.client.serviceUrl.defaultZone | String  | to specify the default zone for the Eureka server. <br/>This property is used by Eureka clients to locate the Eureka server where they register themselves and discover other services |               |
| error.whitelabel.enabled             | Boolean | to control whether the default error page provided by Spring Boot is enabled or not                                                                                                    | true          |

## Endpoints

- **GET /ServiceTwo/hello** : Prints the following in the browser : <h2><i>Service <font color="blue">
  Two</font></i></h2>

## How to Run

To run this project locally, you need to have **Java** and **Maven** installed on your machine.

1. Clone the repository
2. Navigate to the project directory
3. Update the client configuration like `server.port` and `eureka.client.serviceUrl.defaultZone`
   in `application.properties` file.
4. Run `mvn spring-boot:run` to start the application
5. See if the Service is discoverable at the Eureka Server by accessing [http://localhost:1111](http://localhost:1111).
6. Access the resource of this service at [http://localhost:3333/ServiceTwo/hello](http://localhost:3333/ServiceTwo/hello) ( `3333` port as mentioned
   in `application.properties` )

## Dependencies

- Spring Boot
- Spring Boot Web
- Spring Cloud Netflix Eureka Client

## Author

- Harsimar Kaur (https://github.com/simarkaur12).