package com.book.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		System.out.println("Hello World Spring Boot");
		SpringApplication.run(DemoApplication.class, args);
	}

}
