package com.rajesh.spring.core.message;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ViewMessage {

	public static void main(String[] args) {
		
		MessageSource resources = new ClassPathXmlApplicationContext("classpath:com/rajesh/spring/context/message-beans.xml");
		String message = resources.getMessage("user.not.found.message", null, "Default Message", null);
		System.out.println(message);
		String message2 = resources.getMessage("roll.no.notfound",new Object[]{33}, "Default Message", null);
		System.out.println(message2);

		String message3 = resources.getMessage("user.not.found.message", null, "Default Message", Locale.GERMAN);
		System.out.println(message3);
	}

}
