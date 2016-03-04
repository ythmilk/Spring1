package com.yth.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class CarFactoryStatic {
	private static Map<String, Car> map = new HashMap<String, Car>();

	static {
		map.put("ÑÅ¸ó", new Car("ÑÅ¸ó", "250000"));
		map.put("Ë¼²¬î£", new Car("Ë¼²¬î£", "300000"));
	}

	public static Car getCar(String name) {
		return map.get(name);

	}
}
