package com.aberkane.micro_service_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class MicroServiceUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceUserApplication.class, args);
	}

}
