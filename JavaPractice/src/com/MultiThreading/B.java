package com.MultiThreading;

public class B {
	public static void main(String[] args) throws Exception{

		
		A t = new A();
		t.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Sita");
			Thread.sleep(1000);
		}
		
		
		
	}
}
