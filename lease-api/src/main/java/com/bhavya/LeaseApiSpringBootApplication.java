package com.bhavya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
*  This is a Spring Boot application for Leasing API with the main method.
*
*/
@SpringBootApplication
public class LeaseApiSpringBootApplication
{
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    public static void main( String[] args )
    {
        SpringApplication.run(LeaseApiSpringBootApplication.class, args);
    }
}
