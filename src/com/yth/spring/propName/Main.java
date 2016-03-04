package com.yth.spring.propName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-placeholder.xml");
		Address pi = act.getBean(Address.class);
		System.out.println(pi);
	}

}
