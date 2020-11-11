package com.kyojin.indie.di;

/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kyojin.indie.di.attribute.Person;
import com.kyojin.indie.di.constructor.PersonC;
import com.kyojin.indie.di.setter.PersonS;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		
		/* without dependency injection
		Address address = new Address("894567", "somewhere");
		
		Person person = new Person("Erick", 31, address);
		
		System.out.println(person.toString());
		*/
		// with dependency injection
		
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		Person person = context.getBean(Person.class);
		
		PersonC personC = context.getBean(PersonC.class);
		
		PersonS personS = context.getBean(PersonS.class);
		
		System.out.println(person.toString());
		
		System.out.println(personC.toString());
		
		System.out.println(personS.toString());
	}

}
