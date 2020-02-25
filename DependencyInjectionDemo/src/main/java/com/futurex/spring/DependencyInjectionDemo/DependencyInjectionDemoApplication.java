package com.futurex.spring.DependencyInjectionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {

		//Application Context holds all the Beans
		ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		System.out.println("Dependency Injection Demo");

		//AnimalSpeak xyz = new AnimalSpeak(); Commented due to Bean injection
		//Animal animal = new Cat();
		AnimalSpeak xyz = applicationContext.getBean(AnimalSpeak.class);
		Animal animal = applicationContext.getBean(Animal.class);

		xyz.setAnimal(animal);
		xyz.makeAnimalSpeak();
	}

}
