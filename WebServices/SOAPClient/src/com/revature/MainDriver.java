package com.revature;

import java.rmi.RemoteException;

import com.revature.services.HelloGenerator;
import com.revature.services.HelloGeneratorProxy;

public class MainDriver {
	
	/*
	 * 
	 * To consume a SOAP Service, we need a WSDL file for the service.
	 * 
	 * Right click new on project-> new -> other -> web service client 																				-> packages and class will be created with it.
	 * 													You'll be prompted for a wsdl file, give the url of the wsdl file (it will end with "?wsdl")
	 * 
	 */
	
	public static void main(String[] args) throws RemoteException {
		
		//We can't directly instantiate the service class, we need to get a proxy
		HelloGeneratorProxy hgp = new HelloGeneratorProxy();
		
		//The proxy class will get the service class for us
		HelloGenerator hg = hgp.getHelloGenerator();
		
		//The "service" class and method in action
		System.out.println(hg.hello("Bob"));
		
	}

}
