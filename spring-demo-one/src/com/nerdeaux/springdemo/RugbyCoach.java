package com.nerdeaux.springdemo;

public class RugbyCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//create
	public RugbyCoach(){
		
	}
	
	//define a constructor for dependency injection
	public RugbyCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on tackling practice.";	
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return "Rugby: " + fortuneService.getFortune();
	}
	
}
