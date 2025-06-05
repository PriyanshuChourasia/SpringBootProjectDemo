package com.priyanshu.SpringbootProjectDemo;

import com.priyanshu.SpringbootProjectDemo.services.ColourPrinter;
import com.priyanshu.SpringbootProjectDemo.services.impl.ColourPrinterImpl;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootProjectDemoApplication implements CommandLineRunner {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(SpringbootProjectDemoApplication.class);

	private ColourPrinter colourPrinter;

	public SpringbootProjectDemoApplication(ColourPrinter colourPrinter){
		this.colourPrinter = colourPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectDemoApplication.class, args);
	}

	@Override
	public void run(final String... args){
		log.info(colourPrinter.print());

	}

}
