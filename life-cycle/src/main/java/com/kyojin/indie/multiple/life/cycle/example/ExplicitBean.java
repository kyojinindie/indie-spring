package com.kyojin.indie.multiple.life.cycle.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExplicitBean {
	
	
	private static final Logger log = LoggerFactory.getLogger(ExplicitBean.class);

	public void init() {
		log.info("Explicit @PostContruct");
	}
	
	public void destroy() {
		log.info("Explicit @PreDestroy");
	}

}
