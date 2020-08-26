package com.revature.scanner;

import java.util.Scanner;

public class FunWithScanners {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String contents;
		System.out.println("What would you like to print?");
		contents= sc.nextLine();
		System.out.println(contents);
		
		System.out.println("What number would you like to print?");
		String a= sc.nextLine();
		int b= 57+Integer.parseInt(a);
		System.out.println(b);
		

	}

}
