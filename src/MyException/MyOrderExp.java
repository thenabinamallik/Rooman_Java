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
		}
//		catch (InputMismatchException e) {
//			System.out.println("Age can not be string");
//			}
//		catch (ArithmeticException e) {
//			System.out.println("Denominator cant be 0");
//			}
//		
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Try to access within ");
//		}
//		catch (NegativeArraySizeException e) {
//			System.out.println("Kindly provide array size to positive integer");
//			}
//		catch (Exception e) {
//			System.out.println("Kindly provide the right inputs");
//			}
//		
//		System.out.println("Connection terminated gracefully");
//	}
		catch (Exception e) {
			String err = e.getClass().getSimpleName();
			switch (err) {
			case "InputMismatchException": {
				sop(err+ ": Age cant be be string. Kindly, provide integer.");
				sop("connection terminated gracefully");
				break;
			}
			case "ArithmeticException": {
				sop(err + ": denominator can't be zero, should be > 0,");
				sop("Connection terminated");
				break;
			}
			case "IndexOutOfBoundsException": {
				sop(err+ ": index should not be exceded 3");
				sop("connection terminated");
				break;
			}
			case "NegativeArraySizeException": {
				sop(err + ": array length sholudnt be in -ve");
				sop("connection terminated");
				break;
			}
			default:
				sop("Kindly provide the approprieat input");
				break;
			}
			sop("");
			main(args);
		}
		scan.close();
	}}
