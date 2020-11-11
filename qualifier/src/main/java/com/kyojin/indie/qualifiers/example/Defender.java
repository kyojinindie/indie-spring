package com.kyojin.indie.qualifiers.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("defender")
public class Defender implements SoccerPlayer {

	
	private static final Logger log = LoggerFactory.getLogger(Defender.class);

	@Override
	public void play() {
		log.info("Defend");

	}

}
