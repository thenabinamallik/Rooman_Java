package Array;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {

		int[][] building = new int[5][5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < building.length; i++) {
			for (int j = 0; j < building[i].length; j++) {
				System.out.print("data of room[" + i + "][" + j + "] : ");
				building[i][j] = scan.nextInt();
			}
		}

		System.out.println(); //

		for (int i = 0; i <building.length; i++) {
			for (int j = 0; j <building[i].length; j++) {
				System.out.print(building[i][j] + " ");

			}
			System.out.println("");
		}
	}
}
