package com.kyojin.indie.multiple.life.cycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.kyojin.indie.multiple.life.cycle.example.ExplicitBean;

@SpringBootApplication
public class LifeCycleApplication {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public ExplicitBean getExplicitBean() {
		return new ExplicitBean();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LifeCycleApplication.class, args);
		LifeCycleApplication lifeCycleApplication = context.getBean(LifeCycleApplication.class);
	}

}
