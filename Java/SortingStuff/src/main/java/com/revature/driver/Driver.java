package com.revature.driver;

import java.util.Arrays;

public class Driver {
	
	public static void main(String[] args) {
		//System.out.println(Arrays.toString(setUpMess()));
		bubbleSort(setUpMess());
	}
	public static int[] setUpMess() {
		int [] array= new int [20];
		for (int i = 0; i<array.length ; i++) {
			array[i]=array.length-i;
		}		
		return array;
	}
	public static int[] bubbleSort(int [] a) {
		int temp=0;
		int counter=1;
		int passes=1;
		for (int i = 0; i < a.length-1; i++) {
			passes++;
			for(int j=0;j<a.length-i-1;j++) {
				counter++;
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					System.out.println(Arrays.toString(a));
					
			}
				
			}
		}
		System.out.println("counter: "+counter);
		System.out.println("passes: "+passes);
		return a;
	}
	
}
