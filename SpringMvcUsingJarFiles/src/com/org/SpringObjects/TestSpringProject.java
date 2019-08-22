package com.org.SpringObjects;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.classess.HelloConstr;


public class TestSpringProject {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Demo demo = (Demo) ac.getBean("Demo");
		HelloConstr hc = (HelloConstr) ac.getBean("HelloConstr");
		System.out.println(hc.toString());
	}
}
