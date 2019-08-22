package com.org.classess;

import java.util.List;

public class HelloConstr {
	private String msg;
	private List listOfString;
	
	public void setListOfString(List listOfString) {
		this.listOfString = listOfString;
	}
	public List getListOfString() {
		return listOfString;
	}

	public HelloConstr(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "msg -- > "+msg+" "+listOfString.toString();
	}
}
