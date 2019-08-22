
package com.beans.lifecycle;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class BeanLifeCycleMgnt implements DisposableBean,InitializingBean{
	int counter;
	public BeanLifeCycleMgnt() {
		System.out.println("Bean Created "+counter);
	}
	public void init() {
		this.counter++;
		System.out.println("Bean init set "+counter);
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		this.counter++;
		System.out.println("Bean property set "+counter);
	}
	//custome
	public void increament() {
		this.counter++;
		System.out.println("bean incremented "+counter);
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		this.counter++;
		System.out.println("Bean destroyed "+counter);
	}
	public void destroy1() throws Exception {
		// TODO Auto-generated method stub
		this.counter++;
		System.out.println("custom Bean destroyed "+counter);
	}
	
	public static void main(String[] args) {
		
		 //ApplicationContext ac = new ClassPathXmlApplicationContext("SpringXml.xml");
		 //BeanLifeCycleMgnt blm = (BeanLifeCycleMgnt) ac.getBean("BeanLifeCycle");
		// blm.increament();
		// ((AbstractApplicationContext) ac).close();
		Supplier s1 = new Supplier();
		Supplier s2 = new Supplier();
		String d = new String("subhash");
		String d1 = new String("subhash");
		
		 System.out.println(d.hashCode() + " "+d1.hashCode());
		 System.out.println(d.hashCode() == d1.hashCode());
		 System.out.println(d.equals(d1));
		 //Custom class
		 System.out.println(s1.hashCode() + " "+s2.hashCode());
		 System.out.println(s1.hashCode() == s2.hashCode());
		 System.out.println(s1.equals(s2));
			}
}
