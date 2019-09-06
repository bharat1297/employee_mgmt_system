package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJpaRepositories("com.java.repo")
public class Config {

	public static void main(String args[]) {
		SpringApplication.run(Config.class, args);

	}
}
