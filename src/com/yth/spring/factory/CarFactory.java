package com.yth.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
	private Map<String, Car> cars = null;

	public CarFactory() {
		cars = new HashMap<>();
		cars.put("����", new Car("������", "100000"));
		cars.put("����", new Car("����", "100000"));
	}
	public Car getCar(String name){
		return cars.get(name);
		
	}
}
