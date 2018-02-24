package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:velocity.xml"})
public class VelocityApplication {

	public static void main(String[] args) {
		SpringApplication.run(VelocityApplication.class, args);
	}
}
