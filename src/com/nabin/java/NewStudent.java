// Date = 14th Feb 2026

package com.nabin.java;

public class NewStudent {
	String name;
	String id;
	int age;
	String gender;

	public static void main(String[] args) {

		NewStudent s = new NewStudent();

//		s.eat();
		s.name = "Rani";
		s.id = "I10EC411";
		s.age = 22;
		s.gender = "Female";

//		System.out.println(s.name);
//		System.out.println(s.id);
//		System.out.println(s.age);
//		System.out.println(s.gender);
		
		// Generalize coding
//		System.out.println(s.name+" is a student of BPUT bearing id "+s.id+" of "+ s.age+" gender being "+s.gender);
//		System.out.println(100+200+s.name+300+300);
		
		System.out.println("400"+300+400);

	}

	public void eat() {
		System.out.println("Student is Eating");
	}
}
