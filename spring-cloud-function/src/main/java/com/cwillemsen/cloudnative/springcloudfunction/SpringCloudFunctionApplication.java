package com.cwillemsen.cloudnative.springcloudfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;

@SpringBootApplication
public class SpringCloudFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionApplication.class, args);
	}

	@Bean
	public Function<String, String> uppercase() {
		return String::toUpperCase;
	}

	@Bean
	public Consumer<String> consume() {
		return str -> System.out.println("Received " + str);
	}

	@Bean
	public Function<Person, String> fullName() {
		return person -> String.format("%s %s", person.getFirstName(), person.getLastName());
	}

}
