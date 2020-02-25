package com.futurex.spring.DependencyInjectionDemo;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Woof");

	}

}
