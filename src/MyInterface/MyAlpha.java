package MyInterface;

interface A {
	public abstract void m1();
}

interface B extends A{
	public abstract void m2();
//	public B() {
		//Interfaces cannot have constructors
//	}
}

interface C extends A,B { // Multiple inheritance can be done by interface
//	public abstract void m3();
}

public class MyAlpha implements C {

	public static void main(String[] args) {
		MyAlpha ma = new MyAlpha();
		ma.m1();
		ma.m2();
	}

	@Override
	public void m1() {
		System.out.println("This is of Interface A");

	}

	@Override
	public void m2() {
		System.out.println("This is of Interface B");

	}
}
