package com.example.db.sprinbootjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.db.sprinbootjpa.repository")
@SpringBootApplication
public class SprinBootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinBootJpaApplication.class, args);
	}
}
