package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.filters.MyPreFilter;

/*
 * So fare we've used xml based and annotation based configuration 
 * 
 * We're introducing Java based configuration. 
 * 
 * By specifying the following class to be @Configuration, Spring will understand this to be a class that will 
 * generate bean definitions. 
 */

@Configuration
public class MyConfig {
	
	//@Bean above a method means that the return value of this method will bea bean, 
	//i.e. it's expected to be managed by Spring's IoC Container. 
	
	
	@Bean
	public MyPreFilter stuff() {
		return new MyPreFilter();
	}

}
