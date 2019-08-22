package com.org.SpringObjects;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.org.classess.HelloConstr;

public class TestHiBean {
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("SpringConfig.xml"));
		HelloConstr hc = (HelloConstr) bf.getBean("HelloConstr");
		System.out.println(hc.toString());
	}
}
