package com.kyojin.indie.profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kyojin.indie.profiles.example.OperationSystem;

@SpringBootApplication
public class ProfilesApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ProfilesApplication.class);


	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(ProfilesApplication.class, args);
		OperationSystem os = context.getBean(OperationSystem.class);
		log.info("Active OS: " + os.getOperationSystem());
	}

}
