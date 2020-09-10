package com.revature.services;
import javax.jws.WebMethod;
import javax.jws.WebService;

/*
 * Annotation based configurations, this will achieve the same effect as our XML configuration (web.xml and pom.xml)
 * 
 * There are upsides and downsides to both styles:
 * 
 * 	>Annotation is easier to "understand", looking at a class we can see how the annotations are self-explantory and how they are associated (based on their positioning)
 * 	>However, it is tightly coupled. Reconfiguring is more of a hassle, a separate XML file will contain all the configurations we'll need. 
 */

//WebService defines the class as something that can be exposed as a SOAP service 
@WebService
public class HelloGenerator {
	
	
	//WebMethod defines the method as something that can be exposed within a WebService Class. 
	@WebMethod
	public String hello(String name) {
		return "Hello " + name;
	}

}

/*
 * Once a class as been created, defined and appropriately defined. We can expose it as a SOAP web service
 * 
 * Right click the project -> New -> Other -> Create a web service:										-> This will generate a wsdl file (under src/main/webapp/wsdl
 * 																	Select the class of your choosing
 * 																	Select publish (to get it on the web)
 * 	
 * The project has to be running on a server to be consumed by a client (like all web services)							
 */
