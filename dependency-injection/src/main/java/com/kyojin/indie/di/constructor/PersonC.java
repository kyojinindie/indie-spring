package com.kyojin.indie.di.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */
@Component
public class PersonC {
	
	
	private String name;
	private int age;
	
	private AddressC address;

	@Autowired
	public PersonC(@Value("Erick") String name,@Value("31") int age, AddressC address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	public AddressC getAddress() {
		return address;
	}


	public void setAddress(AddressC address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person by constructor [name=" + name + ", age=" + age + ", address=" + address + "]";
	}


}
