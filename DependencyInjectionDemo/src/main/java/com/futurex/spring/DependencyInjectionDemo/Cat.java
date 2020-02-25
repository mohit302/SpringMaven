package com.futurex.spring.DependencyInjectionDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //Bean needs to be managed by Spring
@Primary // Tells thst 'Cat' Bean needs to be injected
public class Cat implements Animal {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Meow");
	}
}
