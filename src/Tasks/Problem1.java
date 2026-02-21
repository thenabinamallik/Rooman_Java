package Tasks;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		int numberofroom;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter the no. of rooms :");
		numberofroom = scan.nextInt();
		
		int[] rooms = new int[numberofroom];
		System.out.println("There are "+numberofroom+" rooms.");
		
	}
}
