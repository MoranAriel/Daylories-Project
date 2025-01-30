package com.calories_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaloriesSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaloriesSystemApplication.class, args);
		System.out.println("System is running");
	}

}
