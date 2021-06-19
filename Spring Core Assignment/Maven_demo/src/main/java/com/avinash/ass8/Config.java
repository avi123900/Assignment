package com.avinash.ass8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Example getExample() {
		Example ex=new Example();
		ex.setSubject("Math");
		return ex;
	}

}
