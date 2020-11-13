package com.kyojin.indie.multiple.injection.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */

@Component
public class ShowGreeting {
	
	@Autowired
	List<Greeting> greetings;
	
	public void showGreetings() {
		greetings.forEach(g -> g.greeting());
	}

}
