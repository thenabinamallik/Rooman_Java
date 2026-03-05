package MyException;
import java.util.Scanner;
import static utils.printUtils.sop;

public class MyExp3 {

	public static Scanner scan;

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		scan = new Scanner(System.in);
		try {
			sop("connection established");
			int[] arr = new int[3];
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			sop("Enter the index u need to access: ");
			int index = scan.nextInt();
			sop(arr[index]);
		} catch (Exception e) {
			sop(e.getClass().getSimpleName()+": index should not be exceded to the array lenth-1");
			sop("connection terminated");
		}

	}
}




















