package Array;

public class MyJagged {
	public static void main(String[] args) {

		int[][] a = new int[3][];

		a[0] = new int[2];
		a[1] = new int[6];
		a[2] = new int[3];

		for (int r = 0; r < a.length; r++) {
			System.out.print("|");
			for (int c = 0; c < a[r].length; c++) {
				System.out.print(+a[r][c]+"|");
			}
			System.out.println(" ");
		}
	}
}
