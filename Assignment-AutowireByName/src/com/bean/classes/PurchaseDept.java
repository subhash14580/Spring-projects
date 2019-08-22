package com.bean.classes;

import com.bean.interfaces.Department;

public class PurchaseDept implements Department{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String deptname() {
		// TODO Auto-generated method stub
		return name;
	}

}