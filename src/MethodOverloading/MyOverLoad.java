package MethodOverloading;

public class MyOverLoad {
	public static void main(String[] args) {
		Printer p = new Printer();

		p.print(21);
		p.print(12.1);
		p.print("hello");
		p.print(10, 12f);
		p.print("nabin", 123.98);
		p.print("h", 1.0f, 1);
		p.print(10, 1.0f, "Hello");

//		p.print(100, 200);
	}
}

class Printer {
	public void print(int a) {
		System.out.println("Inside print Int");
	}

	public void print(double a) {
		System.out.println("Inside print Double");
	}

	public void print(String a) {
		System.out.println("Inside print String");
	}

	public void print(int a, float b) {
		System.out.println("Inside print Int, Float");
//		System.out.println(a); // 100
//		System.out.println(b); // 200.0
	}

	public void print(String a, double b) {
		System.out.println("Inside print String Double");
	}

	public void print(String a, float b, int c) {
		System.out.println("Inside print String Float Int");
	}

	public void print(int a, double b, String c) {
		System.out.println("Inside print Int Double String");
	}
}
