package com.yth.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-autowire.xml");
		PersonInfo pi = act.getBean(PersonInfo.class);
		System.out.println(pi);
	}

}
