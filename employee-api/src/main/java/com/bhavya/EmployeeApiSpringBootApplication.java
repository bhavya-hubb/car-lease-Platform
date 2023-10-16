package com.bhavya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  This is a Spring Boot application for Employee API
 *
 */
@SpringBootApplication
public class EmployeeApiSpringBootApplication
{
    /**
     * This is the main method, which is the entry point of the program.
     * It is executed when the program is run.
     *
     * @param args The command-line arguments .
     */
    public static void main( String[] args )
    {
        SpringApplication.run(EmployeeApiSpringBootApplication.class, args);
    }
}
