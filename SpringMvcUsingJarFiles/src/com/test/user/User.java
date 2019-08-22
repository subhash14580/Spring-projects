package com.test.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.calc.springObjects.Calculator;

public class User {
	Calculator calc;
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calculator getCalc() {
		return calc;
	}
	public void setCalc(Calculator calc) {
		this.calc = calc;
	}
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		/*
		 * Demo demo = (Demo) ac.getBean("Demo"); HelloConstr hc = (HelloConstr)
		 * ac.getBean("HelloConstr");
		 */
		User user = (User)ac.getBean("user");
		System.out.println(user.getName() +" "+ user.getCalc().add(23, 27));
	
}
}
