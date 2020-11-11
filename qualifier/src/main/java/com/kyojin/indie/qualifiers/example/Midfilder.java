package com.kyojin.indie.qualifiers.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("midfilder")
public class Midfilder implements SoccerPlayer {

	
	private static final Logger log = LoggerFactory.getLogger(Midfilder.class);

	@Override
	public void play() {
		log.info("Attack and Defend");

	}

}
