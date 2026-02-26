package StaticKeyword;

class MyStatic {
	static int x;
	static int y;
	
	static {
		System.out.println("Inside static block");
		x = 10;
		y = 20;
	}
	public static void staticMethod() {
		System.out.println("Inside static Method");
		System.out.println("Accessing static Variable");
		System.out.println(x);
		System.out.println(y);
//		System.out.println(a);
//		System.out.println(b);
	}
	
	int a;
	int b;
	
	{
		System.out.println("inside instance block");
		a =100;
		b =200;
	}
	
	public void instanceMethod() {
		System.out.println("Inside instance method");
	}
	
	public MyStatic() {
		System.out.println("Inside constructor");
		System.out.println("Accessing instace variable");
		System.out.println(a);
		System.out.println(b);
	}
}

public class MyAlpha {
	public static void main(String[] args) {
		MyStatic.staticMethod();
		MyStatic m = new MyStatic();
		m.instanceMethod();
		System.out.println(MyStatic.x);
		System.out.println(MyStatic.y);
	}
}
