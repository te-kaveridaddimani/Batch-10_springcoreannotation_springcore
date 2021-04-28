package com.te.springcoreannota.example;

public class Cat  implements Animal{

	@Override
	public void eat() {
	System.out.println("dog is eating...");
		
	}

	@Override
	public void speak() {
		System.out.println("meow meow.....");
		
	}

}
