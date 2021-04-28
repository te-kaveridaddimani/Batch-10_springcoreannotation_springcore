package com.te.springcoreannotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannobeanclass.Department;

@Configuration
public class DepartmentConfig {
	
@Bean("dept")
	public Department getDept() {
		Department dept=new Department();
		dept.setDid(10);
		dept.setDname("development");
		return dept;
		
	}

@Bean("hr")
public Department getHr() {
	Department dept=new Department();
	dept.setDid(20);
	dept.setDname("HR");
	return dept;
	
}

@Bean("sales")
public Department getSales() {
	Department dept=new Department();
	dept.setDid(30);
	dept.setDname("Sales");
	return dept;
	
}
}



