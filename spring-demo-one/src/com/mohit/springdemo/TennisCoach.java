package com.mohit.springdemo;

public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;

//	@Override
//	public String getFortune() {
//		return "Here you go - " + fortuneService.getFortune();
//	}
	
	public TennisCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Toe the ball!!";
	}

	@Override
	public String getDailyFortune() {
		return "Here you go - " + fortuneService.getFortune();
	}

}
