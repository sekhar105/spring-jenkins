package com.sekhar.jenkinsdemo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

public static	Logger logger= LoggerFactory.getLogger(JenkinsDemoApplication.class);
	
	@PostConstruct
	public void postConstruct() {
		logger.info("application started....");
	}
	
	public static void main(String[] args) {
		
		logger.info("applicatoin executed");
		logger.info("for second commit");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
