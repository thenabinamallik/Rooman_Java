package Array;
import java.util.Scanner;
public class ThreeDArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][][] building = new int[2][][];
		
		building[0] = new int[3][];
		building[0][0] = new int[7];
		building[0][1] = new int[2];
		building[0][2] = new int[4];
		
		building[1] = new int[4][];
		building[1][0] = new int[3];
		building[1][1] = new int[6];
		building[1][2] = new int[9];
		building[1][3] = new int[1];
		for (int b = 0; b < building.length; b++) {
			for (int r = 0; r < building[b].length; r++) {
				for (int c = 0; c < building[b][r].length; c++) {
					System.out.print("Input for ["+b+"]["+r+"]["+c+"] : ");
					building[b][r][c] = scan.nextInt();
				}
			}
		}
		System.out.println("");
		for (int b = 0; b < building.length; b++) {
			for (int r = 0; r < building[b].length; r++) {
				for (int c = 0; c < building[b][r].length; c++) {
					System.out.print("["+building[b][r][c] + "]");
				}
				System.out.println();
			}
			System.out.println("");
		}
	}
}
