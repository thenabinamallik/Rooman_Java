package Tasks;

import java.util.Scanner;

public class Problem4 {
	
	public static void main(String[] args) {
		
		int[][] building = new int[3][3];

		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < building.length; i++) {
			for (int j = 0; j<building[i].length; j++) {
				System.out.print("Enter the data in room: a[" + i + "][" + j + "] : ");
				building[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(); // 
		
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println("Data in room: a[" + i + "][" + j + "] is : " + building[i][j]);

			}
		}
	}
}
