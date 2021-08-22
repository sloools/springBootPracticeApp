package com.song.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.song.app.beans.MyEvent;

@Service
public class EventService {
	
	@Autowired
	ApplicationEventPublisher publisher;
	
	public void threeSecont() {
		
		long startTime = System.currentTimeMillis();
		
		System.out.println("Call Start threeSecond Method");
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		
		System.out.println("Call End threeSecond Method");
		
		long endTime = System.currentTimeMillis();
		long durationTime = (endTime - startTime) / 1000;
		
		publisher.publishEvent(new MyEvent(this, durationTime)); // MyEvent를 이벤트 리스너에게 전달
	}
}
