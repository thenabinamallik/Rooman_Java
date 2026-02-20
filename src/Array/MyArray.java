package Array;

import java.util.Scanner;

public class MyArray {
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner scan = new Scanner(System.in);
		
		
//		a[0] = 20;
//		a[1] = 22;
//		a[2] = 23;
//		a[3] = 21;
//		a[4] = 23;
		
		for(int i = 0; i<a.length; i++) {
			System.out.print("Enter number of position a["+i+"] : ");
			a[i] = scan.nextInt();
		}
		System.out.println("");
		for(int i = 0; i<a.length; i++) {
			System.out.println("at a["+i+"] : "+a[i]);
		}
		
		
	}
}
