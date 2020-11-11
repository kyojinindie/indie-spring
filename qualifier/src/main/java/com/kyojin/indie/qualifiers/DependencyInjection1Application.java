package com.kyojin.indie.qualifiers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kyojin.indie.qualifiers.example.SoccerPlayer;
import com.sun.tools.sjavac.Log;

@SpringBootApplication
public class DependencyInjection1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjection1Application.class, args);
		SoccerPlayer forward = context.getBean("forward", SoccerPlayer.class);
		SoccerPlayer defender = context.getBean("defender", SoccerPlayer.class);
		SoccerPlayer midfilder = context.getBean("midfilder", SoccerPlayer.class);
		forward.play();
		defender.play();
		midfilder.play();
	}

}
