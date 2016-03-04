package com.yth.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class CarFactoryStatic {
	private static Map<String, Car> map = new HashMap<String, Car>();

	static {
		map.put("�Ÿ�", new Car("�Ÿ�", "250000"));
		map.put("˼���", new Car("˼���", "300000"));
	}

	public static Car getCar(String name) {
		return map.get(name);

	}
}
