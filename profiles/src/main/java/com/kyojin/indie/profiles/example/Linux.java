package com.kyojin.indie.profiles.example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */

@Service
@Profile("linux")
public class Linux implements OperationSystem {

	@Override
	public String getOperationSystem() {
		// TODO Auto-generated method stub
		return "Linux";
	}

}
