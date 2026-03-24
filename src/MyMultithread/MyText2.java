package MyMultithread;

import java.util.Scanner;

class Test2 extends Thread {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("printnum")) {
			printNum();
		} else if (name.equals("printchar")) {
			printChar();
		} else if (name.equals("addition")) {
			addition();
		}
	}

	public void printNum() {
		System.out.println("Printing Numbers (1–10)");
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void printChar() {
		System.out.println("Printing Characters (a–z)");
		for (char c = 'A'; c <= 'Z'; c++) {
			try {
				Thread.sleep(500);
				System.out.println(c);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void addition() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Addition Task");
		System.out.print("Enter first number: ");
		int a = sc.nextInt();

		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		System.out.println("Sum = " + (a + b));
		sc.close();
	}
}

public class MyText2 {

	public static void main(String[] args) {

		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();

		t1.setName("printnum");
		t2.setName("printchar");
		t3.setName("addition");

		t1.start();
		t2.start();
		t3.start();
	}
}