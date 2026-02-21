package Tasks;

import java.util.Scanner;

public class Problem6 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int[][] classroom = new int[3][];

	classroom[0] = new int[4];
	classroom[1] = new int[2];
	classroom[2] = new int[3];

	for (int r = 0; r < classroom.length; r++) {
		for (int c = 0; c < classroom[r].length; c++) {
			System.out.print("Mark the student at class ["+r+"]["+c+"] :");
			classroom[r][c] = scan.nextInt();
		}

	}
	System.out.println();
	for (int r = 0; r < classroom.length; r++) {
		System.out.print("|");
		for (int c = 0; c < classroom[r].length; c++) {
			System.out.print(+classroom[r][c]+"|");
		}
		System.out.println(" ");
	}
	
	
}
}
