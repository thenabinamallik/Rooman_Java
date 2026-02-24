package MyStringPack;

public class MyString7 {
	public static void main(String[] args) {
		String str = "Bhubaneswar";

		char[] ch = str.toCharArray();

//	    System.out.println(ch[3]); // b

//		for (int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i]); // Bhubaneswar
//		}
		
		// Enhanced for loop
		for(char c: ch) {
			System.out.print(c); // Bhubaneswar
		}
		
	}
}
