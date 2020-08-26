package com.revature.voodoo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
	/* Reflection is a way for Java to inspect itself at runtime
	 * break encapsulation!
	 * Contains methods for runtime inspection of objects
	 * -Class of object
	 * -Fields
	 * -Methods
	 * -Constructors
	 * This can include private members!
	 * can modify and instantiate, call methods etc
	 * java.lang.reflect
	 */
	public static void main(String[] args) {
		try {
			Class<?> c= Class.forName("javax.swing.JFrame");
			System.out.println("Constructors:");
			Constructor<?>[] con= c.getConstructors();
			for(int i=0;i<con.length;i++) {
				System.out.println(" "+ con[i]);
			}
			System.out.println("Fields:");
			Field f[]= c.getFields();
			for(int i=0; i<f.length;i++) {
				System.out.println(" "+ f[i]);
			}
			System.out.println("Methods:");
			Method[] m=c.getMethods();
			for(int i=0;i<m.length;i++ ) {
				System.out.println(" "+ m[i]);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
