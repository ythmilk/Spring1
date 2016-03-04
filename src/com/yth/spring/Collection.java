package com.yth.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Collection {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonCars pc = ctx.getBean(PersonCars.class);
		System.out.println(pc);
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("map.xml");
//		MapBean mb = ctx.getBean(MapBean.class);
//		System.out.println(mb);
	}

}
