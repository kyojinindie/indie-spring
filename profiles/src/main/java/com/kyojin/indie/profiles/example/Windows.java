package com.kyojin.indie.profiles.example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */
@Service
@Profile({"windows","default"})
public class Windows implements OperationSystem {

	@Override
	public String getOperationSystem() {
		
		return "Windows";
	}

}
