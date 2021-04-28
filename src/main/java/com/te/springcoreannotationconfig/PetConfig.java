package com.te.springcoreannotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannobeanclass.Pet;
@Import({AnimalConfig.class})
@Configuration
public class PetConfig {
@Bean
@Primary
	public Pet getPetObject() {
		Pet pet=new Pet();
		pet.setPname("sony");
		return pet;
	}
}
