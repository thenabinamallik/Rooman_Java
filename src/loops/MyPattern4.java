package loops;

public class MyPattern4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print("*");
			}
			for (int r = 1; r <= 3; r++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
