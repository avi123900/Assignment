package com.avinash.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Customer customer=(Customer)context.getBean("customer");
		customer.show();
		
	}

}
