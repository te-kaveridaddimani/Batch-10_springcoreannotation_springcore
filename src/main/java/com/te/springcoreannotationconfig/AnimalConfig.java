package com.te.springcoreannotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannota.example.Animal;
import com.te.springcoreannota.example.Cat;
import com.te.springcoreannota.example.Dog;

@Configuration
public class AnimalConfig {
@Bean
	public Animal getDog() {
		return new Dog();
	}
@Bean
	public Animal getCat() {
		return new Cat();
	}
}
