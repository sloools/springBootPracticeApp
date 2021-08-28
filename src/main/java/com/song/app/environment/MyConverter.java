package com.song.app.environment;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.song.app.beans.ConvertExBean;

@Component
public class MyConverter implements Converter<String, ConvertExBean>{ // String -> ConvertExBean으로 컨버팅
	
	
	@Override
	public ConvertExBean convert(String source){
		ConvertExBean ex = new ConvertExBean();
		ex.setId(source);
		
		return ex;
	}

}
