package com.sub.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sub.Car;

public class test {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringXml.xml");
		 Car blm = (Car) ac.getBean("touristcar");
		System.out.println("TouristCar -->"+ blm.getMake() + " " +blm.getColor());
		blm = (Car)ac.getBean("newCar");
		System.out.println("New Car -->"+ blm.getMake() + " " +blm.getColor());
		blm = (Car)ac.getBean("anotherCar");
		System.out.println("Another Car -->"+ blm.getMake() + " " +blm.getColor());
			}
}
