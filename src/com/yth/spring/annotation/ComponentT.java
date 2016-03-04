package com.yth.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.yth.spring.annotation.c.ControllerIn;
import com.yth.spring.annotation.c.ControllerT;

@Component("ct")
public class ComponentT {
	@Autowired
	@Qualifier("controllerIn")
	private ControllerIn ct;
	public void writeC() {
		
		System.out.println("ComponentT---");
		ct.writeC();
	}
}
