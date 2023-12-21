package com.example.factorypattern;

import com.example.factorypattern.service.BurgerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FactoryPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryPatternApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(BurgerService service) {
		return args -> {
			service.getBurger("chicken");
			service.getBurger("cheese");
		};
	}

}
