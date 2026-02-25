package Encapsulation;


public class MyClassLoad {
	public static void main(String[] args) {
		Demo d = new Demo();
		
		d.display();
	}

}


class Demo{
	
	int a = 10;
	int b = 20;
	
	public void display() {
		System.out.println("inside display()");
		System.out.println(a);
		System.out.println(b);
	}
}