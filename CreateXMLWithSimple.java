package com.example.simple.create;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import org.simpleframework.xml.*;
import org.simpleframework.xml.core.*;

import com.example.dataprovider.DataProvider;
import com.example.simple.model.Customer;
import com.example.simple.model.Customers;

//Credited to David Gassner
public class CreateXMLWithSimple {
	public static void main(String[] args) throws IOException {

		List<Customer> data = DataProvider.getData(DataProvider.SMALL);
		
		Customers customers = new Customers();
		customers.setCustomers(data);
		
		Serializer serializer = new Persister();
		StringWriter sw = new StringWriter();
		try {
			serializer.write(customers, sw);
			System.out.println(sw.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
