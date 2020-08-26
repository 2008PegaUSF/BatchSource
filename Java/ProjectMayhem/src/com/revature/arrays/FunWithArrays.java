package com.revature.arrays;

import java.util.Arrays;

public class FunWithArrays {
	//group of like-typed variables that referred by a common name
	public static void main(String[] args) {
		//int array w/ 6 "buckets"
		int [] myArray= new int[6]; 
		
		int [] chaos= {3,5,1,5,755,878,23,556,858};
		chaos[5]=99;
		System.out.println(chaos[5]);
		
		for(int i=0;i<chaos.length;i++) {
			chaos[i]=chaos[i]*4;
		}
		//Arrays.sort(chaos);
		
		for(int i:chaos) {
			System.out.println(i);
		}
		Arrays.sort(chaos);
		System.out.println(Arrays.toString(chaos));
		
	}
}
