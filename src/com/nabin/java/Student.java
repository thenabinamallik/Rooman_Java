package com.nabin.java;

// Class name must be Capital and same as the file name.
class Student {

	// String is an object so its in Capitalcase.
	String name;
	int age;
	String gender;

	// Method name should be in smallercase.
	public void eat() {
		System.out.println("Student Eats");
	}

	public void study() {
		System.out.println("Student Studies");
	}

	public static void main(String[] args) {

		Student s = new Student();
		// new keyword creates an object using the Student Class(Blueprint)
		s.eat();
		s.study();
	}
}