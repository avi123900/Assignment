package com.avinash.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private String customerId="12";
	private String customerName="Avinash";
	private String customerContact="3456789012";
	@Autowired
	@Qualifier("address")
	private Address customerAddress;
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerConatact) {
		this.customerContact = customerConatact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public void show() {
		System.out.println("customer Id : "+getCustomerId()+" customer Name : "+getCustomerName()+" customer Contact : "+getCustomerContact()+" customer Address :"+getCustomerAddress().getCity()+" , "+getCustomerAddress().getCountry()+", "+getCustomerAddress().getState()+", "+getCustomerAddress().getStreet()+", "+getCustomerAddress().getZip());
	}
	

}

