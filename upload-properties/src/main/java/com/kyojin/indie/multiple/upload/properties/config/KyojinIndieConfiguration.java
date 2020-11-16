package com.kyojin.indie.multiple.upload.properties.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:kyojinIndie.properties")
public class KyojinIndieConfiguration {

	@Bean
	public PropertySourcesPlaceholderConfigurer loadProperties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
