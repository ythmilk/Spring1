package com.yth.spring;

import java.util.List;
//关于集合的Bean配置
public class PersonCars {
	private String name;
	private String age;
	private List<Car> cars;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "PersonCars [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}

}
