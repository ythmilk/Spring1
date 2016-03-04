package com.yth.spring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-factory.xml");
		Car car1 = (Car) act.getBean("car1");
		System.out.println(car1);
		Car car2 = (Car) act.getBean("car2");
		System.out.println(car2);
	}

}
