package com.te.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannobeanclass.Employee;
import com.te.springcoreannotationconfig.AllConfig;
import com.te.springcoreannotationconfig.EmployeeConfig;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(AllConfig.class);
Employee employee =context.getBean(Employee.class);
System.out.println(employee.getId());
System.out.println(employee.getName());
System.out.println(employee.getDept().getDid());
System.out.println(employee.getDept().getDname());

	}

}
