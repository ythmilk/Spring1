package com.yth.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.yth.spring.annotation.c.ControllerT;
import com.yth.spring.annotation.r.RespositoryT;
import com.yth.spring.annotation.s.ServiceT;

public class Main {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-annotation.xml");
		ComponentT ct = (ComponentT) act.getBean("ct");
		ct.writeC();

//		ControllerT conT = (ControllerT) act.getBean("controllerT");
//		conT.writeC();
//
//		RespositoryT rt = (RespositoryT) act.getBean("respositoryT");
//		rt.writeR();
//
//		ServiceT st = (ServiceT) act.getBean("serviceT");
//		st.writeS();

	}

}
