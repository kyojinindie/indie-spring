package com.kyojin.indie.scope;

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

import com.kyojin.indie.scope.example.Default;
import com.kyojin.indie.scope.example.Prototype;
import com.kyojin.indie.scope.example.Singleton;

@SpringBootApplication
public class ScopesApplication {

	
	private static final Logger log = LoggerFactory.getLogger(ScopesApplication.class);

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ScopesApplication.class, args);
		Singleton singleton = context.getBean(Singleton.class);
		Singleton singletonCopy = context.getBean(Singleton.class);
		Prototype prototype = context.getBean(Prototype.class);
		Prototype prototypeCopy = context.getBean(Prototype.class);
		Default default1 = context.getBean(Default.class);
		Default defaultCopy = context.getBean(Default.class);
		
		log.info("Our singleton beans are equals: {}", singleton == singletonCopy);
		log.info("Our prototype beans are equals: {}", prototype == prototypeCopy);
		log.info("Our default beans are equals: {}", default1 == defaultCopy);
	}

}
