package com.revature.iterate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
	/*Iterator
	 * Anything that can be used as the subject of a for each loop uses an iterator
	 * Aka they implement the Iterable interface
	 * Every collection has an iterator that allows traversal between elements and 
	 * allows safe removal of elements in place
	 */
	public static void main(String[] args) {
		//create an ArrayList
		List<String> a1= new ArrayList<String>();
		//add elements
		a1.add("C");
		a1.add("D");
		a1.add("G");
		a1.add("B");
		a1.add("A");
		a1.add("F");
		a1.add("E");
		//use iterator to display the contents of a1
		System.out.println("Original contents of a1: ");
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.print(element +" ");
		}
		//Modify objects being iterated
		ListIterator<String> litr= a1.listIterator();
		while(litr.hasNext()) {
			String element=litr.next();
			litr.set(element+"+");
		}
		System.out.println("\nModified Contents of a1: ");
		itr= a1.iterator();
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.print(element +" ");
		}
		//Display the List backwards
		System.out.println("\nModified list backwards:");
		while(litr.hasPrevious()) {
			String element =litr.previous();
			System.out.print(element+" ");
		}
	}

}
