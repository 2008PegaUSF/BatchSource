package com.revature.recursion;

public class Fibby {

	/* Fibonacci Sequence
	 * 0,1,1,2,3,5,8,13,21,24,55...
	 * Fn = Fn-1 + Fn-2
		The first two terms of the series are 0, 1.
		For example: fib(0) = 0, fib(1) = 1, fib(2) = 1
	 * Iterative
	 * 
	 * Recursive
	 * 	calling itself
	 */
	public static void main(String[] args) {
		//fibbyIterative(8);
		fibbyRecursive(8);
	}
	public static void fibbyIterative(int i) {
		//use a loop
		int current=1;
		int previous=0;
		int pp=0;
		for (int j = 1; j < i; j++) {
			System.out.print(current+", ");
			pp=previous;
			previous= current;
			current=pp+previous;
			
		}
		System.out.print(current);
	}
	
	public static int fibbyRecursive(int m) {
		//recursion
		if(m==1) {
			return 1;
		}
		if(m==0) {
			return 0;
		}
		else {
			
			int f = (fibbyRecursive(m-1) + fibbyRecursive(m-2));
			//System.out.println(f);
			return(f);
			
		}
	}
}
