package com.mohit.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// create object :: Re-factoring -> Changing variable references to interface
//		Coach theCoach = new BaseballCoach();
		Coach theCoach = new CricketCoach();
		
		// Use object
		System.out.println(theCoach.getDailyWorkout());		

	}

}
