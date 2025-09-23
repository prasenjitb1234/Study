package com.OOP.Learn.encapsulationLearn;

class Student1 {

	private String name;
	private int age;
	private int marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}

public class EncapsulationDemo2 {
	public static void main(String[] args) {

		Student1 obj = new Student1();
		
		obj.setName("prasenjit");
		obj.setAge(21);
		obj.setMarks(95);
		
		System.out.println( obj.getName() );
		System.out.println( obj.getAge() );
		System.out.println( obj.getMarks());
	}
}
