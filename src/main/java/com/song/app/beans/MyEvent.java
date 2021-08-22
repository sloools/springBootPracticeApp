package com.song.app.beans;

import org.springframework.context.ApplicationEvent;

import lombok.Data;

@Data
public class MyEvent{
	
	private Object source;
	
	private long eventTime;

	public MyEvent(Object source, long eventTime) {
		this.source = source;
		this.eventTime = eventTime;
	}
//	
//	public Object getSource() {
//		return source;
//	}
}
