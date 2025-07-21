package com.priyanshu.SpringbootProjectDemo;

import com.priyanshu.SpringbootProjectDemo.config.PizzaConfig;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootProjectDemoApplication implements CommandLineRunner {

	private PizzaConfig pizzaConfig;

	public SpringbootProjectDemoApplication(PizzaConfig pizzaConfig){
		this.pizzaConfig = pizzaConfig;
	}
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(SpringbootProjectDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectDemoApplication.class, args);
	}

	@Override
	public void run(final String... args){
		log.info("I want a {} crust pizza, with {} and {} sauce",pizzaConfig.getCrust(), pizzaConfig.getTopping(), pizzaConfig.getSauce());
	}

}
