package com.song.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.song.app.beans.ConvertExBean;

@RestController
@RequestMapping("/convert")
public class ConvertController {
	
	@GetMapping("/{id}")
	public Map<String, String> getName(Map<String, String> param){
//		ConvertExBean convertExBean = new ConvertExBean();
//		convertExBean.setId(id);
//		String name = param.get("name");
		Map<String, String> map = new HashMap<String, String>();
//		
//		map.put("id", param);
//		map.put("id", "123");
		
		System.out.println("map : " + param);
		
		return param;
	}
	
	@GetMapping("/myconvert/{id}")
	public ConvertExBean MyConverter(ConvertExBean ex) {
		System.out.println(ex);
		ex.setAge("29");
		ex.setName("song");
		
		return ex;
	}

}
