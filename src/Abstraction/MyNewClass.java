package Abstraction;

abstract class MyAbstract {

	static int a = 10;

	static {
		System.out.println("Inside static block");
	}

	public static void m1() {
		System.out.println("inside static method");
	}

	int x = 100;

	{
		System.out.println("Inside instance block");
	}

	public MyAbstract() {
		System.out.println("Inside constructor");
	}

	public void m2() {
		System.out.println("Instance method");
	}

	public abstract void m3();

}

public class MyNewClass {
	public static void main(String[] args) {

	}
}
