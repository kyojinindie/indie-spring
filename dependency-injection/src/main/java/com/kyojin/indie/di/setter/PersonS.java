package com.kyojin.indie.di.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */
@Component
public class PersonS {
	
	
	private String name;
	private int age;
	private AddressS address;

	public PersonS() {
	}

	public String getName() {
		return name;
	}
	
	@Value("Erick")
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Value("31")
	public void setAge(int age) {
		this.age = age;
	}
	
	

	public AddressS getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(AddressS address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person by setter [name=" + name + ", age=" + age + ", address=" + address + "]";
	}


}
