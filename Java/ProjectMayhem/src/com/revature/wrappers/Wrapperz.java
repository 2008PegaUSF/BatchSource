package com.revature.wrappers;

public class Wrapperz {
	/*
	Character - char
	Boolean - boolean
	Byte - byte
	Short - short
	Integer -int
	Long -long
	Float -float
	Double - double
	*/
	
	static int myInt=3;
	static Integer myInteger=5;
	static Double myDouble=45.94;
	/*(Auto)boxing - implicit conversion from primitive type to wrapper class.
	  (Auto)unboxing - implicit conversion from wrapper to primitive type.
	   Both boxing and unboxing are expensive processes.

	 * 
	 */
	public static int addEmUp(int a, int b) {
		return a+b;
	}
	public static Integer multiplyThem(Integer a, Integer b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		//System.out.println(addEmUp(myInt,myDouble.intValue())); //unboxing
		System.out.println(multiplyThem(6,myInt)); // boxing
	}

}
