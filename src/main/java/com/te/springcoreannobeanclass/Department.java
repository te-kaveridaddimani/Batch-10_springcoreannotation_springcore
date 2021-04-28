package com.te.springcoreannobeanclass;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Department {

	public Department() {
		
	}
	private int did;
	private String dname;
	
}
