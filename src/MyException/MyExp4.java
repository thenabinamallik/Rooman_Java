package MyException;

import java.util.Scanner;
import static utils.printUtils.sop;

public class MyExp4 {
	public static Scanner scan;
	public static void main(String[] args) {
		// NegativeArraySizeException
		scan = new Scanner(System.in);
		try {
			sop("connection established");
			sop("Enter the size of array : ");
			int n = scan.nextInt();
			int[] arr = new int[n];
			sop("length of the array "+arr.length);
		} catch (Exception e) {
			sop(e.getClass().getSimpleName()+": array length sholudnt be in -ve");
			sop("connection terminated");
		}
	}
}
