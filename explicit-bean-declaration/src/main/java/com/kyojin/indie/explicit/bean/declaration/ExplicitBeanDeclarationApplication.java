package com.kyojin.indie.explicit.bean.declaration;
/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExplicitBeanDeclarationApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(ExplicitBeanDeclarationApplication.class);
	
	@Bean
	
	public String getKyojinIndie() {
		return "<kyojin,indie/>";
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(ExplicitBeanDeclarationApplication.class, args);
		String kyojinIndie = context.getBean(String.class);
		log.info(kyojinIndie);
	}

}
