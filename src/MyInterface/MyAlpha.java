package MyInterface;

interface A {
	public abstract void m1();
	public static final int a = 20;
}

interface B extends A {
	public abstract void m2();
//	public B() {
	// Interfaces cannot have constructors
//	}
}

interface C extends A, B { // Multiple inheritance can be done by interface
	public abstract void m3();
}

class MyBetta {
	public void m4() {
		System.out.println("this is inside Betta Class");
	}

}

public class MyAlpha extends MyBetta implements C {
	public static void main(String[] args) {
		MyAlpha ma = new MyAlpha();
		ma.m1();
		ma.m2();
		ma.m3();
		ma.m4();
		System.out.println(C.a);
	}

	@Override
	public void m1() {
		System.out.println("This is of Interface A");
	}

	@Override
	public void m2() {
		System.out.println("This is of Interface B");
	}

	public void m3() {
		System.out.println("This is of Interface C");
	}
}
