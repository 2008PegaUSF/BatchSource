package com.revature.strangs;

public class FunWithStrings {
	/* Strings!
	 * not char or Character
	 * Fully Qualified class name:java.lang.String
	 * String literal is 0+ characters ex "" or String a = "Roll Tide";
	 * concatenate Strings w/ +  or .concat("something")
	 * "goodbye " + "earth"
	 * Strings are immutable
	 * String pool- collection of unique String literals in heap memory
	 * String API has utility methods!
	 */
	
	public static void main(String[] args) {
		String d= new String("Roll");
		System.out.println(d.hashCode());
		String a= "Roll";//this creates a new reference in the string pool
		System.out.println(a.hashCode());
		a= a.concat(" Tide"); //this ALSO creates a new reference in the string pool
		System.out.println(a);
		System.out.println(a.hashCode());
		String b= "Roll";
		System.out.println(b.hashCode());
		String c= "Roll";//compiler is searches string pool to see if this exists already
		System.out.println(c.hashCode());
		System.out.println(c.charAt(3));
		/* String- String pool!, Immutable, thread safe (synchronized), fast
		 * StringBuilder- no String pool, Mutable, not thread safe, fast
		 * StringBuffer- no String pool, Mutable, thread safe, slow
		 */
		StringBuilder sb=new StringBuilder("Hey");
		System.out.println(sb.hashCode());
		StringBuffer t= new StringBuffer("Hey");
		System.out.println(t.hashCode());
		
	}

}
