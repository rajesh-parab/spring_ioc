package com.rajesh.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppContext {

	@Bean
	public ClassRoom classRoom() {
		ClassRoom classRoom = new ClassRoom();
		classRoom.setCourse(course());
		return classRoom;
	}

	@Bean
	public Course course() {
		Course course= new Course();
		course.setSubject(subject());
		return course;
	}
	
	@Bean
	public Subject subject() {
		return new Subject();

	}
	@Bean(initMethod = "setup", destroyMethod = "cleanup")
	public Car car() {
		return new Car();

	}
	@Bean 
	@Scope("prototype")
	public Car bmwCar() {
		return new Car();

	}

}
