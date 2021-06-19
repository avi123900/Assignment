package com.constructor.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.constructor.javaconfig")
public class JavaTest {

	@Bean 
	public Address getAddress() {
		Address address=new Address("patna","bihar","India","abc","80001");
		return address;
	}
	
	@Bean
	public Customer getCustomer() {
		Customer cus=new Customer("100","Avinash","12345+6789");
		return cus;
	}
}
