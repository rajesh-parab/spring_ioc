package com.rajesh.spring.core.message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SportEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	
	
	public ApplicationEventPublisher getPublisher() {
		return publisher;
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher appEventPublisher) {
		publisher=appEventPublisher;
		

	}
	
public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/rajesh/spring/context/message-beans.xml");
	SportEventPublisher eventPublisher=	context.getBean("sportEventPublisher",SportEventPublisher.class);
	if(context==eventPublisher.getPublisher()){
		System.out.println("#########  event and context are same ");
	}
		 
	}

}
