package com.example.springnosqlexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class SpringNosqlExampleApplication {

	Map<String, String> numbers = Map.of("1", "One", "2", "Two", "3", "Three");

	public static void main(String[] args) {
		SpringApplication.run(SpringNosqlExampleApplication.class, args);
	}

	@GetMapping("/")
	public String health() {
		return "Sample Application is Up and Running!";
	}

	@GetMapping("/numbers")
	public Map<String, String> message() {
		return numbers;
	}

	@GetMapping("/numbers/{number}")
	public String getNumber(@PathVariable("number") String number) {
		return numbers.get(number);
	}

}
