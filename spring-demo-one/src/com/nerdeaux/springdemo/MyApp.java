package com.nerdeaux.springdemo;


public class MyApp {

	public static void main(String[] args) {
		// create the object
		Coach theCoach = new RugbyCoach();
		//Coach theCoach = new SoccerCoach();
				
		// use the object
		System.out.println(theCoach.getDailyWorkout());	

	}

}
