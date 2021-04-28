package com.te.springcoreannobeanclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	
	public Employee() {
		
	}
private int id;
private String name;
@Autowired(required = false)
@Qualifier("hr")
private Department dept;

}
