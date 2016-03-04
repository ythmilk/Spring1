package com.yth.spring.annotation.c;

import org.springframework.stereotype.Controller;
@Controller("controllerIn")
public class ControllerT implements ControllerIn{ 
	public void writeC() {
		System.out.println("ControllerT---");
	}
}
