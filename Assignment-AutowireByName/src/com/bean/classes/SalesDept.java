package com.bean.classes;

import com.bean.interfaces.Department;

public class SalesDept implements Department{
	private String name;
	
	@Override
	public String deptname() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
