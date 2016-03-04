package com.yth.spring;

import java.util.Map;

public class MapBean {
	private String name;
	private Map<String, Object> map;

	public void setName(String name) {
		this.name = name;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "MapBean [name=" + name + ", map=" + map + "]";
	}
	
}
