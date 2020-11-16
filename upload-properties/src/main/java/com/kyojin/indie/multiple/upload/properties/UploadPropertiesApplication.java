package com.kyojin.indie.multiple.upload.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kyojin.indie.multiple.upload.properties.example.KyojinIndie;

@SpringBootApplication
public class UploadPropertiesApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(UploadPropertiesApplication.class);


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(UploadPropertiesApplication.class, args);
		
		KyojinIndie kyojinIndie = context.getBean(KyojinIndie.class);
		
		log.info(kyojinIndie.getAuthor());
	}

}
