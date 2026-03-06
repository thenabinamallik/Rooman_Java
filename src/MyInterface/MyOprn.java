package MyInterface;

import java.util.Scanner;

interface Calculator {
	public abstract void add();

	public abstract void sub();
}

class Calci implements Calculator {
	public void add() {
		int a = 100;
		int b = 200;
		System.out.println("a+b :" + (a + b));
	}

	public void sub() {
		int a = 200, b = 100;
		System.out.println("a-b :" + (a - b));
	}
}

class SciCalci implements Calculator {
	Scanner scan = new Scanner(System.in);

	public void add() {
		System.out.println("For Addition (a+b)");
		System.out.print("Enter value for a :");
		int a = scan.nextInt();
		System.out.print("Enter value for b :");
		int b = scan.nextInt();

		System.out.println("sum : " + (a + b));
	}

	public void sub() {
		System.out.println("For Substraction (a-b)");
		System.out.print("Enter value for a :");
		int a = scan.nextInt();
		System.out.print("Enter value for b :");
		int b = scan.nextInt();
		System.out.println("diff " + (a - b));
	}
}

class MathCalci implements Calculator {
	Scanner scan = new Scanner(System.in);

	public void add() {
		System.out.println("Enter num > 100");
		System.out.println("Enter the value of a :");
		int a = scan.nextInt();
		if (a >= 100) {
			System.out.println("Enter b : ");
			int b = scan.nextInt();
			System.out.println("Additon : " + (a + b));
		} else {
			System.out.println("a can't be < 100");
		}
	}

	public void sub() {
		System.out.println("Enter num < 100");
		int a = scan.nextInt();
		if (a <= 100) {
			System.out.println("Enter b : ");
			int b = scan.nextInt();
			if (a > b) {
				System.out.println("Substraction : " + (a - b));
			} else {
				System.out.println("b can't be < a");
				sub();
			}
		} else {
			System.out.println("a can't be < 100");
			
			sub();
			
		}
	}
}

public class MyOprn {
	public static void main(String[] args) {
		Calci c1 = new Calci();
		SciCalci c2 = new SciCalci();
		MathCalci c3 = new MathCalci();

		c1.add();
		c1.sub();
		System.out.println();
		c2.add();
		c2.sub();
		c3.add();
		c3.sub();
		System.out.println();
	}

}
