package MyException;

import java.util.Scanner;
import static utils.printUtils.sop;

public class DuckingException {
	public static void main(String[] args) throws Exception {
		Demo4 d4 = new Demo4();
		try {
			d4.m4();
		} catch (Exception e) {
			sop("Exception handled in the main method");
		}
	}
}

class Demo5{
	Scanner scan = new Scanner(System.in);
	public void m5() throws ArithmeticException {
		sop("Connection2 Established");	
		sop("Enter num a");
		int a = scan.nextInt();
		sop("Enter num b");
		int b = scan.nextInt();
		int c = a/b;
		sop(c);
		sop("Connection 2 Teminated");
	}
}

class Demo4{
	public void m4() {
		Demo5 d5 = new Demo5();
		d5.m5();
	}
}