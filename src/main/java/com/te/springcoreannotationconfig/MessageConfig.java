package com.te.springcoreannotationconfig;

import org.springframework.context.annotation.Bean;

import com.springcoreannotation.postprocess.MyBeanFactory;
import com.springcoreannotation.postprocess.MyBeanPP;
import com.te.springcoreannobeanclass.Message;

public class MessageConfig {

	@Bean(name="msgBean")
	public Message getMsg() {
		Message message =new Message();
		message.setMsg("now im emp of te");
		return message;
	}
@Bean
public MyBeanFactory getMBFPP() {
	return new MyBeanFactory();
}
@Bean
public MyBeanPP getMBPP() {
	return new MyBeanPP();
}
	
}
