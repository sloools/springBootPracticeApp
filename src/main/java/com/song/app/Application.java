package com.song.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		
		var app = new SpringApplication(Application.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

}
