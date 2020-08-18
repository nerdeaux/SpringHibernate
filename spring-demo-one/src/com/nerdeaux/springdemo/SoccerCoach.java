package com.nerdeaux.springdemo;

public class SoccerCoach implements Coach {

	//define a private field for the dependency
	private FortuneService fortuneService;
	
	public SoccerCoach(){
		
	}
		
	//define a constructor for dependency injection
	public SoccerCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
		
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5km!";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return "Soccer: " + fortuneService.getFortune();
			
	}

}
