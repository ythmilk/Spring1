package com.yth.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		HelloWorld hello = new HelloWorld();
//		hello.setName("姚腾辉");
//		hello.sayHello();
		//1.创建Spring的IoC容器对象
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取Bean实例
		HelloWorld hello=(HelloWorld) ctx.getBean("helloWorld");
		hello.sayHello();
		//3.调用hello方法
		Car car=(Car) ctx.getBean("car");
		System.out.println(car.toString());
		
		Person person=(Person) ctx.getBean("person1");
		System.out.println(person.toString());
	}

}
