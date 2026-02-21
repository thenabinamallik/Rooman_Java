package MyStringPack;

public class MyString4 {
	public static void main(String[] args) {
		
		String s1 = new String("Rooman");
		String s2 = new String("Rooman");
		String s3 = new String("rooman"); // N.B: Strings are case sensitive
		
		System.out.println(s1 == s2); // false  N.B: (== -> address check )
		
		System.out.println(s1.equals(s2)); // true N.B: (.equals -> content check )
		System.out.println(s1.equals(s3)); // false
		
		System.out.println(s1.equalsIgnoreCase(s3)); // true
	}
}
