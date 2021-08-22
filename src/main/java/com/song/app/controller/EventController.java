package com.song.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.song.app.service.EventService;

@RestController
@RequestMapping("/event")
public class EventController {
	
	@Autowired
	EventService eventService;
	
	@GetMapping("/publisher")
	public String Eventpublisher(String name) {
		eventService.threeSecont();
		return "Event Strat";
	}
}
