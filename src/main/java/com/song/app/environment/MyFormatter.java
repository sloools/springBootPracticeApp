package com.song.app.environment;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.song.app.beans.FormatterExBean;
import com.song.app.beans.FormatterExBean2;

@Component
public class MyFormatter implements Formatter<FormatterExBean2>{
	
	@Override
	public FormatterExBean2 parse(String text, Locale locale) throws ParseException {
		FormatterExBean2 formatterExBean = new FormatterExBean2();
		formatterExBean.setId(text);
		return formatterExBean;
	}
	
	@Override
	public String print(FormatterExBean2 object, Locale locale) {
		
		return object.getId();
	}
	
}
