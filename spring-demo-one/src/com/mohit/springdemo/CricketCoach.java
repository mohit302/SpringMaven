package com.mohit.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService; // interface is called here
	private String emailAddress;
	private String team;
	
	public CricketCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	public CricketCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("Cricketcoach: inside no-args constructor");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricketcoach: inside setter - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Hit the ball out of the park";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it!, " + fortuneService.getFortune();
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricketcoach: inside team setter");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricketcoach: inside email setter");
		this.emailAddress = emailAddress;
	}

}