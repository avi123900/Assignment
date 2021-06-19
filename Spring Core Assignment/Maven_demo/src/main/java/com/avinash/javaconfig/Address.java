package com.avinash.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String city= "Mirganj";
	private String state= "Bihar";
	private String country= "India";
	private String street="123A";
	private String zip="841423";
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;}
	
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;}

	
	

}
