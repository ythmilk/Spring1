package com.yth.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		HelloWorld hello = new HelloWorld();
//		hello.setName("Ҧ�ڻ�");
//		hello.sayHello();
		//1.����Spring��IoC��������
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��IOC�����л�ȡBeanʵ��
		HelloWorld hello=(HelloWorld) ctx.getBean("helloWorld");
		hello.sayHello();
		//3.����hello����
		Car car=(Car) ctx.getBean("car");
		System.out.println(car.toString());
		
		Person person=(Person) ctx.getBean("person1");
		System.out.println(person.toString());
	}

}
