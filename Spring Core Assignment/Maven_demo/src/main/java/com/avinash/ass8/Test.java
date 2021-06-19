package com.avinash.ass8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
	public static void main(String args[]) {
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Example example=context.getBean("getExample",Example.class);
		System.out.println(example);
		
		
	}

}
