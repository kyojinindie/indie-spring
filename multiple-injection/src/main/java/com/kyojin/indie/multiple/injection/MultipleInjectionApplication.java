package com.kyojin.indie.multiple.injection;
/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kyojin.indie.multiple.injection.example.ShowGreeting;

@SpringBootApplication
public class MultipleInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MultipleInjectionApplication.class, args);
		ShowGreeting sg = context.getBean(ShowGreeting.class);
		sg.showGreetings();
	}

}
