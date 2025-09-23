package com.OOP.encapsulation;

class A {

	// encapsulation is combination of data hiding + abstraction

	private int value; // data hiding

	public void setValue(int x) {  // data abstraction
		value = x;
	}

	public int getValue() {
		return value;
	}

}

public class B {

	public static void main(String[] args) {
		A r = new A();

		r.setValue(100);
		System.out.println(r.getValue());
	}

}
