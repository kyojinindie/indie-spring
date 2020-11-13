package com.kyojin.indie.multiple.injection.example;
/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class KyojinIndie implements Greeting {

	
	private static final Logger log = LoggerFactory.getLogger(KyojinIndie.class);

	@Override
	public void greeting() {
		log.info("Open source is a development methodology; free software is a social movement.");
	}

}
