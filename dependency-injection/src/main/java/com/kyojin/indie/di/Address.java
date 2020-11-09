package com.kyojin.indie.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */

@Component
public class Address {
	
	@Value("84642")
	private String zipCode;
	
	@Value("somewhere")
	private String address;
	
	public Address() {
		super();
	}

	public Address(String zipCode, String address) {
		super();
		this.zipCode = zipCode;
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [zipCode=" + zipCode + ", address=" + address + "]";
	}

}
