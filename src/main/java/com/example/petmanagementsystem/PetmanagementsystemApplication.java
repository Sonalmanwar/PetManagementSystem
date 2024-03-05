package com.example.petmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages="com.example.petmanagementsystem.service")
@SpringBootApplication
public class PetmanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetmanagementsystemApplication.class, args);
	}

}
