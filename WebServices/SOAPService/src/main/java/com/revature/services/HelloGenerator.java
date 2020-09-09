package com.revature.services;
import javax.jws.WebMethod;
import javax.jws.WebService;

/*
 * Annotation based
 */
@WebService
public class HelloGenerator {
	
	/*
	 * web.xml is a configuration file (XML-configuration)
	 */
	
	@WebMethod
	public String hello(String name) {
		return "Hello " + name;
	}

}
