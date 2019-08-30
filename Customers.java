package com.example.simple.model;

import java.util.List;

import org.simpleframework.xml.*;

//Credited to David Gassner
@Root(name="customers")
public class Customers {

	@ElementList(inline=true)
	private List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
		
}
