package com.ExceptionHandling.synchronization;

public class Customer {
	
	public static void main(String[] args) {
		
		Bus r = new Bus(1);
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.setName("Ram");
		t2.setName("Shyam");
		t3.setName("Raju");
		
		t1.start();   t2.start();   t3.start();
		
		
		
		
	}
	
}
