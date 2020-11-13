package com.kyojin.indie.multiple.injection.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */

@Component
public class Brazil implements Greeting {
	
	private static final Logger log = LoggerFactory.getLogger(Brazil.class);

	@Override
	public void greeting() {
		log.info("Oi");

	}

}
