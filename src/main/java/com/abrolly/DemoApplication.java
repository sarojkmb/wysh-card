package com.abrolly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.abrolly.model.Customer;
import com.abrolly.repository.CustomerRepository;



@SpringBootApplication
public class DemoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(CustomerRepository customerRepository) {
		return (args) -> {
			customerRepository.save(new Customer(1, "Gustavo", "Ponce..."));
			customerRepository.save(new Customer(2, "John", "Smith..."));
			logger.info("The sample data has been generated");
		};
	}
}
