package com.revature;

import java.rmi.RemoteException;

import com.revature.services.HelloGenerator;
import com.revature.services.HelloGeneratorProxy;

public class MainDriver {
	
	public static void main(String[] args) throws RemoteException {
		
		HelloGeneratorProxy hgp = new HelloGeneratorProxy();
		
		HelloGenerator hg = hgp.getHelloGenerator();
		
		System.out.println(hg.hello("Bob"));
		
	}

}
