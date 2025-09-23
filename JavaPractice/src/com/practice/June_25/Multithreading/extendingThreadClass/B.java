package com.practice.June_25.Multithreading.extendingThreadClass;

class A extends Thread{
	
	public void run() {
		for(int i = 1;i<= 5;i++) {
			System.out.println("prasenjit");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	
}


public class B {
	public static void main(String[] args) {
		A t = new A();
		t.start();
	}
}
