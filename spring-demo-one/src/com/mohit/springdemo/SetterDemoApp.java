package com.mohit.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from spring container
//		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoach = context.getBean("myTCoach", Coach.class);
		
//		CricketCoach theCoach = context.getBean("myCCoach", CricketCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
//		System.out.println(theCoach.getEmailAddress());
//		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();

	}

}
