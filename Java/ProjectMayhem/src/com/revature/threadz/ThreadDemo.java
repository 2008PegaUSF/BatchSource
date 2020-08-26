package com.revature.threadz;

public class ThreadDemo {
	/* 2 ways to spin up a thread
	 * 1. extend Thread class
	 * 2. implement Runnable and overwrite Run()
	 */
	public static void main(String[] args) {
		//Thread State-new
		Thread extendThread= new ExtendThread();
		Thread implementThread= new Thread(new ImplementRunnable());
		
		implementThread.setPriority(10);
		
		//Thread State- start
		extendThread.start();
		implementThread.start();
		
		for (int i = 0; i <100; i++) {
			System.out.println("Hey-Driver");
		}
		
	}

}
