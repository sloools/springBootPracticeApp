package com.song.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// 정적 메소드 호출 방식
		//SpringApplication.run(Application.class, args); 
		
		// 객체 생성 방식 (더 객체지향적)
		var app = new SpringApplication(Application.class);
		app.setWebApplicationType(WebApplicationType.SERVLET); // NONE : 자바 애플리케이션으로 실행 & 톰캣 구동 x 
		app.run(args);
	}

}
