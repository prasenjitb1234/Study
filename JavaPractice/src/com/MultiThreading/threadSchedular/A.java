package com.MultiThreading.threadSchedular;

public class A extends Thread{
	
	
	public void run() {
		
		String n = Thread.currentThread().getName();
		for(int i=1;i<=3;i++) {
			System.out.println(n);
		}
		
	}
	
	
	
}
