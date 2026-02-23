package MyStringPack;

public class MyString6 {
	public static void main(String[] args) {

		String str = "Bhubaneswar";

		/*
		 * lenght -> in Array
		 * length() -> in String
		 */

		System.out.println(str.length()); // 11

		System.out.println(str.substring(0, 5)); // Bhuba

		System.out.println(str.substring(3, 8)); // banes

		System.out.println(str.substring(3)); // baneswar
		
		System.out.println(str.substring(2, 2)); //            [empty line]

	}
}
