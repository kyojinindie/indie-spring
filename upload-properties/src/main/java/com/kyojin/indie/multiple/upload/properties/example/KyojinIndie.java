package com.kyojin.indie.multiple.upload.properties.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KyojinIndie {
	
	@Value("${kyojinIndie.author}")
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
