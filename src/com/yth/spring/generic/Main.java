package com.yth.spring.generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-generic.xml");
		UserService userService = (UserService) act.getBean("userService");
		userService.add();
	}

}
