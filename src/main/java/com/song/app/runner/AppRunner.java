package com.song.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.song.app.beans.MyEvent;

//@Component
public class AppRunner implements ApplicationRunner{
	
	@Autowired
	ApplicationEventPublisher eventPublisher;
	
	@Override
	public void run(ApplicationArguments args) throws Exception{
//		String name = "Service";
//		MyEvent myEvent = new MyEvent(this, name);
//		eventPublisher.publishEvent(myEvent);
	}
}
