package com.yth.spring;

public class HelloWorld {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("hello " + name);
	}

	public HelloWorld() {
		System.out.println("��ʼ��������");// TODO Auto-generated constructor stub
	}
}
