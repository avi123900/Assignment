package com.avinash.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
		Example d=(Example)con.getBean("example");
		System.out.println(d);
	}

}
