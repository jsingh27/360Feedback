package com.pronto.cabs;

public class Customer {

	int customerId;
	String customerName;
	String location;

	public void getCustomer(int id, String name, String location) {
		customerId = id;
		customerName = name;
		this.location = location;

	}

	public void putCustomer() {
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(location);

	}

}
