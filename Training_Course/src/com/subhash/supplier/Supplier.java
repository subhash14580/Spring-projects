package com.subhash.supplier;

import java.util.Comparator;

public class Supplier {
	private int supplierId;
	private String name;
	private String phone;
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", name=" + name + ", phone=" + phone + "]";
	}
	/*
	 * @Override public int compare(Object arg0, Object arg1) { Supplier obj1 =
	 * (Supplier)arg0; Supplier obj2 = (Supplier)arg1; if(obj1.supplierId ==
	 * obj2.supplierId) return 0; else if(obj1.supplierId > obj2.supplierId) return
	 * 1; else return -1;
	 * 
	 * }
	 */
	
	
}
