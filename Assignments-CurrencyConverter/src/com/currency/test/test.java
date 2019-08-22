package com.currency.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.currency.converter.Visitor;


public class test {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringXml.xml");
		Visitor v = (Visitor)ac.getBean("visitor");
		System.out.println(v.getName());
		v.getCurrencyToINR().setCountry("Euros");
		System.out.println(v.getCurrencyToINR().getExchangeRate(100));
		v.getCurrencyToINR().setCountry("Dollars");
		System.out.println(v.getCurrencyToINR().getExchangeRate(100));
		
		
		v.getCurrenyToEurosAndDollars().setCountry("Euros");
	System.out.println(v.getCurrenyToEurosAndDollars().getExchangeRate(10000));
	v.getCurrenyToEurosAndDollars().setCountry("Dollars");
	System.out.println(v.getCurrenyToEurosAndDollars().getExchangeRate(7000));
			}
}
