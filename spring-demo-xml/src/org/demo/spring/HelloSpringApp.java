package org.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call method
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyInstruction());
		//close the context
		context.close();

	}

}
