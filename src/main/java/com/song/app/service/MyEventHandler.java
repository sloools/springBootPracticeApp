package com.song.app.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.song.app.beans.MyEvent;

@Component
public class MyEventHandler {
	@EventListener(MyEvent.class)
	public void onMyEvent(MyEvent event) {
//		System.out.println("On My Event Execution");
		System.out.print(event.getSource() + "클래스를 처리하는 데 ");
		System.out.println(event.getEventTime() + "초가 걸렸습니다");
	}
	
	@EventListener(MyEvent.class)
	public void onMyEvent2(MyEvent event) {
//		System.out.println("On My Event Execution");
		System.out.print(event.getSource() + "클래스를 처리하는 데 ");
		System.out.println(event.getEventTime() + "초가 걸렸습니다");
	}
	
//	@EventListener()
}
