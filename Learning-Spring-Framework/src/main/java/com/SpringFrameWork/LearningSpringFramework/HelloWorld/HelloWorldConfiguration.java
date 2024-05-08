package com.SpringFrameWork.LearningSpringFramework.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;



record Person (String name, int age, Address address) { };

record Address (String firstline, String city, long PinCode) {};


@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "madhu";
	}
	
	@Bean
	public int age() {
		return 22;	
	}
	
	@Bean
	public Person person() {
		return new Person("Murali", 20,new Address("marathahalli", "Bengaluru", 500072));
		
	}
	@Bean
	public Person person2Methodcall() {
		return new Person(name(), age(),address());
		
	}
	@Bean
	public Person person3Parameters(String name, int age, Address address3) { //name, age,address2
		return new Person(name, age,address3);
		
	}
	
	@Bean (name = "address2")
	@Primary
	public Address address() {
		return new Address("koramangala", "Bengaluru", 500072);
	}
	
	@Bean (name = "address3")
	public Address address3() {
		return new Address("Mahdevapura", "Bengaluru", 500072);
	}

}
