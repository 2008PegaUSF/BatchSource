package com.revature.classtypes;
/* special type of class than can't be instantiated
 * specify what a class must do, but not how it does it!
 * lack instance variables
 * characterized by behavior
 * can mimic multiple inheritance w/ interfaces
 * classes can implements interface 0+
 * interfaces can extend other interfaces 0+
 * All variable are implicitly static, public, and final (java8) * 
 */
public interface Hunt {
	void findPrey();
}
