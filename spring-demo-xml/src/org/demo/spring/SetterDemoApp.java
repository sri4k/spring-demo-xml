package org.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyInstruction());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		context.close();
	}

}