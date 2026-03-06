package MyException;

import java.util.Scanner;

class MyATM {
	public void m1() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection established");
		try {
			System.out.println("Enter a:");
			int a = sc.nextInt();
			System.out.println("Enter b:");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("Result of a/b is " + c);
		} catch (Exception e) {
			System.out.println("Sorry for the inconvenience, we'll get back soon!!");
			throw e;
		}
		finally {
			System.out.println("Connection terminated");
			sc.close();
		}
	}
}

public class MyRethrow {
	public static void main(String[] args) {
		MyATM atm = new MyATM();
		try {
			atm.m1();
		} catch (Exception e) {
			System.out.println("Exception caught in main");
//			e.printStackTrace();
		}
	}
}
