package com.te.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.te.springcoreannobeanclass.Message;
import com.te.springcoreannotationconfig.MessageConfig;

public class MessageTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MessageConfig.class);
		Message message=context.getBean(Message.class);
		System.out.println(message);
		((AbstractApplicationContext)context).close();

	}

}
