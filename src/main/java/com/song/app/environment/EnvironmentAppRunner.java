package com.song.app.environment;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EnvironmentAppRunner implements ApplicationRunner {
	
	final ApplicationContext context;
	
	final Environment environment;
	
	
//	final Environment environment;
	
	public void run(ApplicationArguments args) throws Exception{		
		/*
		 * song.name=yongho song.age=29 song.country=Korea
		 */
		
		//1. Autowired ApplicationContext
		Environment environmentFromContext = context.getEnvironment();
		
		System.out.println(environmentFromContext.getProperty("song.name"));
		System.out.println(environmentFromContext.getProperty("song.age"));
		System.out.println(environmentFromContext.getProperty("song.country"));
		
		//2. Autowired Environment
		System.out.println(environment.getProperty("song.name"));
		System.out.println(environment.getProperty("song.age"));
		System.out.println(environment.getProperty("song.country"));
		
	}
}