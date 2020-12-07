package org.demo.spring;

public class MyApp {

	public static void main(String[] args) {

		Coach coach = new TrackCoach(new TrackInstruction());
		System.out.println(coach.getDailyWorkout());
	}

}
