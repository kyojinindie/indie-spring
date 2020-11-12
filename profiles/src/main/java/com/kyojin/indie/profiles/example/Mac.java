package com.kyojin.indie.profiles.example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */

@Service
@Profile("mac")
public class Mac implements OperationSystem {

	@Override
	public String getOperationSystem() {
		return "Mac";
	}

}
