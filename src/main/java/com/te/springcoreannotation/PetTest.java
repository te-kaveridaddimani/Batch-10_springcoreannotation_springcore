package com.te.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannobeanclass.Pet;

public class PetTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("PetConfig.class");
		Pet pet=new Pet();
		pet.setPname("vicky");
		System.out.println(pet.getPname());
		System.out.println(pet.getAnimal());
	}

}
