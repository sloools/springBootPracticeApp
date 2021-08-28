package com.song.app.service;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Service
public class PostParsingService {
	public String postParse(String name, String brand, String front, String rear) {
		Gson gson = new Gson();
				
		JsonObject shapeObj = new JsonObject();
		JsonArray shapeArr = new JsonArray();
		
		shapeObj.addProperty("front", front);
		shapeObj.addProperty("rear", rear);
		shapeArr.add(shapeObj);
		
		JsonObject typeObj = new JsonObject();
		
		typeObj.addProperty("brand", brand);
		typeObj.add("shape", shapeArr);
		
		JsonObject myPostReqObj = new JsonObject();
		
		myPostReqObj.addProperty("name", name);
		myPostReqObj.add("type", typeObj);
		
		System.out.println("=========================");
		System.out.println("toString : " + myPostReqObj.toString());
		
		String result = gson.toJson(myPostReqObj);
		System.out.println("=========================");
		System.out.println("gson.toJson : " + result);
		
		System.out.println("=========================");
		System.out.println("getAsJsonObject" + myPostReqObj.getAsJsonObject());
		
		return "request success";
	}
}
