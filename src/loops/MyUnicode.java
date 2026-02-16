package loops;

public class MyUnicode {

	public static void main(String[] args) {

		for (char i = '\u0B00'; i <= '\u0B7F'; i++) {
			System.out.println((int)i + " : " +  i);
		}

	}

}
