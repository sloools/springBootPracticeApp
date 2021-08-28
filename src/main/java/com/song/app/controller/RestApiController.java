package com.song.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.song.app.beans.MyPostReq;
import com.song.app.service.PostParsingService;

@RestController
@RequestMapping("/api")
public class RestApiController {

	@Autowired
	PostParsingService postParsingService;
	
	@PostMapping("/responsetest")
	public String postResponsetTest(@RequestBody MyPostReq myPostReq) {
		System.out.println(myPostReq);
		return "Y";
	}
	
//	@PostMapping("/requesttest")
	@GetMapping("/requesttest")
	public String postRequestTest(@RequestParam("name") String name, @RequestParam("brand") String brand, @RequestParam("front") String front, @RequestParam("rear") String rear) {
		try {
			postParsingService.postParse(name, brand, front, rear);
		} catch (Exception e) {
			System.out.println("Fail");
		}
		
		
		return "Success";
	}
}
