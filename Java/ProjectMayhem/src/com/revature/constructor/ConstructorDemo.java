package com.revature.constructor;

public class ConstructorDemo extends D{

	/*Constructors
	 * how we instantiate an object
	 * No return type but does return that object that it created
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("In Main");
		C c=new C();

	}
	class T{
		//inner class
	}
}

class A{
	static {System.out.println("A's static code block");}
	A(){
		//B b= new B(); This breaks things
		System.out.println("Inside A's Constructor");
	}
	{System.out.println("A's instance code block");}
}

class C extends B{
	static {System.out.println("C's static code block");}
	C(){
		System.out.println("Inside C's Constructor");
	}
}
class B extends A{
	B(){

		System.out.println("Inside B's Constructor");
	}
}

class D {
	static {System.out.println("D's Static code block");}
	D(){
		System.out.println("Inside D's constructor");
	}
}
