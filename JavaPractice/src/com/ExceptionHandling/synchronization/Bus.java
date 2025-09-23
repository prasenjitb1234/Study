package com.ExceptionHandling.synchronization;


public class Bus implements Runnable{
	
	int available = 1, passanger;
	Bus(int passanger){
		this.passanger = passanger;   // passanger = 1
	}
	
	public synchronized void run() {    // t1 or t2 or t3
		 
		String name = Thread.currentThread().getName();
		if(available >= passanger) {       // 0>=1 
			System.out.println(name+"  Reserved Seat ...");
			available = available - passanger;  // 1 - 1 = 0
		}
		else {
			System.out.println("Sorry Seat not available");
		}
	}
}
