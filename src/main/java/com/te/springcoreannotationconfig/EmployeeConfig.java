package com.te.springcoreannotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannobeanclass.Employee;
@Configuration
public class EmployeeConfig {
@Bean
	public Employee getEmployee() {
		return new Employee();
	}
@Bean
@Primary
public Employee getEmp() {
	Employee employee= new Employee();
	employee.setId(1);
	employee.setName("kaveri");
	return employee;
}

}
