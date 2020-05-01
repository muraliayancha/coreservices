package com.example.coreservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.services.core.*"})
public class CoreservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreservicesApplication.class, args);
	}

}
