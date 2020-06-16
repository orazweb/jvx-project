package com.wildcodeschool.disco_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wildcodeschool.disco_project.track.TrackDisplay;

@SpringBootApplication
public class DiscoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoProjectApplication.class, args);

		TrackDisplay.run();
	}

}
