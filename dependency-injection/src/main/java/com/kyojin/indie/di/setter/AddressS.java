package com.kyojin.indie.di.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */

@Component
public class AddressS {
	
	
	private String zipCode;
	
	
	private String address;
	
	public AddressS() {
		super();
	}

	public AddressS(String zipCode, String address) {
		super();
		this.zipCode = zipCode;
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	@Value("84642")
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	@Value("somewhere")
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [zipCode=" + zipCode + ", address=" + address + "]";
	}

}
