package MyStringPack;

public class MyString5 {
	public static void main(String[] args) {
		String str = "Odisha";
		System.out.println(str.startsWith("Odi")); // true
		System.out.println(str.startsWith("odi")); // false
		System.out.println(str.endsWith("Sha")); // false
		System.out.println(str.endsWith("sha")); //true
	}
}
