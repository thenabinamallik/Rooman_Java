package MyException;

import java.util.InputMismatchException;
import java.util.Scanner;
import static utils.printUtils.sop;

public class MyOrderExp {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		sop("connection established !!");
		try {
			sop("Enter your age: ");
			int age = scan.nextInt();
			sop("Age entered is : " + age);
			sop("Enter int a");
			int a = scan.nextInt();
			sop("Enter int b");
			int b = scan.nextInt();
			int c = a / b;
			sop("Reasult of a/b is: " + c);
			sop("connection established");
			int[] arr = new int[3];
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			sop("Enter the index u need to access: ");
			int index = scan.nextInt();
			sop(arr[index]);
			sop("Enter the size of array : ");
			int n = scan.nextInt();
			int[] arr1 = new int[n];
			sop("length of the array " + arr1.length);
		} catch (InputMismatchException e) {
			sop(e.getClass().getSimpleName() + ": Age cant be be string. Kindly, provide integer.");
			sop("connection terminated gracefully");
		} catch (ArithmeticException e) {
			sop(e.getClass().getSimpleName() + ": denominator can't be zero, should be > 0,");
			sop("Connection terminated");
		} catch (IndexOutOfBoundsException e) {
			sop(e.getClass().getSimpleName() + ": index should not be exceded 3");
			sop("connection terminated");
		} catch (NegativeArraySizeException e) {
			sop(e.getClass().getSimpleName() + ": array length sholudnt be in -ve");
			sop("connection terminated");
		}
		catch (Exception e) {
			sop("Kindly provide the approprieat input");
		}
		scan.close();
	}
}
