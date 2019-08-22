package com.bean.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.interfaces.Department;

public class Emp {
	String name;
	int id;
	Department purchaseDept;

		public Department getPurchaseDept() {
		return purchaseDept;
	}
	public void setPurchaseDept(Department purchaseDept) {
		this.purchaseDept = purchaseDept;
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		public static void main(String[] args) {
			
			 ApplicationContext ac = new ClassPathXmlApplicationContext("SpringXml.xml");
			 Emp emp = (Emp) ac.getBean("Emp");
			 System.out.println(emp.getPurchaseDept().deptname());
			 System.out.println(emp.getId());
			 System.out.println(emp.getName());
		}
}
