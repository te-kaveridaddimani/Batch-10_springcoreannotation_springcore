package com.te.springcoreannobeanclass;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


import lombok.Data;

@Data
public class Message implements Serializable{
	
	public Message() {
		System.out.println("Instantiation phaes");
	}
	
	private String msg;
	
	@PostConstruct
	private void init() {
		System.out.println("init phase");
	}
	@PreDestroy
	private void destroy() {
		System.out.println("destory phase");
	}
	
}
