package com.revature.design;

public class Driver {
	private static HondaFactory hf=new HondaFactory();
	public static void main(String[] args) {
		Car c1=hf.makeCar("crv","black");
		Car c2= hf.makeCar("civic","browngreen");
		Car c3=hf.makeCar("potato", "clearbabypuke");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
