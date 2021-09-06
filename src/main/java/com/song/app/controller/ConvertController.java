package com.song.app.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.song.app.beans.ConvertExBean;
import com.song.app.beans.FormatterExBean;
import com.song.app.beans.FormatterExBean2;

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
	
	@GetMapping(value = {"/myconvert", "/myconvert/{id}"})
	public String MyConverter(@PathVariable Optional<FormatterExBean2> id) {
		if(id.isPresent()) {
			System.out.println("yes id");
			System.out.println(id);
		}else {
			System.out.println("no id");
		}
		
		return "Y";
	}
	
	@GetMapping("/myconvert2/{id}")
	public String MyConverter(ConvertExBean id) {
	
			System.out.println(id);
		
		
		return "Y";
	}
	
	@GetMapping("/myformatter/{id}")
	public String myFormatter(@PathVariable("id") FormatterExBean2 ex) { // @PathVariable() 안에 {경로} 값을 써넣든지, 객체의 이름과 같게 해야 한다. 
		System.out.println("ex : " + ex);
//		System.out.println(ex.getClass());
//		
		return ex.getId().toString();
	}
}
