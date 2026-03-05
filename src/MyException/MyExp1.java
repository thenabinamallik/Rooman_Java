package MyException;

import java.util.Scanner;
import static utils.printUtils.sop;

public class MyExp1 {

	private static Scanner scan;

	public static void main(String[] args) {
//		// InputMismatchException	
		scan = new Scanner(System.in);
		try {
			sop("connection establishd !!");
			sop("Enter your age: ");
			int age = scan.nextInt();
			sop("Age entered is : " + age);
		} catch (Exception e) {
			sop(e.getClass().getSimpleName()+": Age cant be be string. Kindly, provide integer.");
			sop("connection terminated gracefully");
			scan.close();
		}
	}
}
