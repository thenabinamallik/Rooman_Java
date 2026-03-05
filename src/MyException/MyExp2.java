package MyException;

import java.util.Scanner;
import static utils.printUtils.sop;

import java.util.Scanner;

public class MyExp2 {
	public static void main(String[] args) {
		// ArithmeticException
		Scanner sc = new Scanner(System.in);
		sop("Connection terminated");
		try {
			sop("connection Estabalished");
			sop("Enter int a");
			int a = sc.nextInt();
			sop("Enter int b");
			int b = sc.nextInt();
			int c = a / b;
			sop("Reasult of a/b is: " + c);
		} catch (Exception e) {
			sop(e.getClass().getSimpleName()+": denominator can't be zero, should be > 0,");
			sop("Connection terminated");
			sc.close();
		}
	}

}