package MyStringPack;

public class MyString3 {
public static void main(String[] args) {
	String s1 = new String("Rooman");
	String s2 = new String("Rooman");
	String s3 = "Rooman";
	String s4 = "Rooman";
	
	System.out.println(s1 == s2);
	System.out.println(s2 == s3);
	System.out.println(s3 == s4);
	System.out.println(s4 == s1);
}
}
