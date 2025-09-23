package com.MultiThreading;

public class A extends Thread{
	
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Ram");
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
