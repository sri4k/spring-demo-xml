package org.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are same instance
		boolean result = (coach == alphaCoach);
		
		System.out.println("\nPointing to the same object "+result);
		System.out.println("\nMemory location of the coach object "+coach);
		System.out.println("\nMemory location of the alpha coach object "+alphaCoach);
		
		context.close();
	}

}
