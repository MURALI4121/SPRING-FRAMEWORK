package com.SpringFrameWork.LearningSpringFramework.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.SpringFrameWork.LearningSpringFramework.game.GameRunner;
import com.SpringFrameWork.LearningSpringFramework.game.MarioGame;
import com.SpringFrameWork.LearningSpringFramework.game.PacManGame;
import com.SpringFrameWork.LearningSpringFramework.game.SuperContraGame;

public class App02HelloSpring {

	public static void main(String[] args) {
		
		//1: Launch a spring Context
		 try(var context = 
				 new AnnotationConfigApplicationContext
				 (HelloWorldConfiguration.class)){
		
		//2: Configure the things that we want Spring to manage - @Configuration
		// Hello WorldConfiguration - @Configuration
		// name - @Bean
		
		//3: Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("person2Methodcall"));
		
		System.out.println(context.getBean("person3Parameters"));
		
		System.out.println(context.getBean("address2"));
		
		System.out.println(context.getBean(Address.class));
		

		 } 
		 
	}

}
