package com.example.IPL_REST_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class IplRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplRestApiApplication.class, args);
		System.out.println("Hello");
	}

}
