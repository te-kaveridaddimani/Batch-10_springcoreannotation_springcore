package com.te.springcoreannotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannobeanclass.Employee;
@Configuration
public class EmployeeConfig2 {

	@Bean
	public Employee getEmp() {
		Employee employee=new Employee();
		employee.setId(100);
		employee.setName("kavita");
		return employee;
	}
}
