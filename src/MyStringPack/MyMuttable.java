package MyStringPack;

public class MyMuttable {
	public static void main(String[] args) {
		String str = "Rooman";

		System.out.println(str); // Rooman
		System.out.println(str.concat("Technology")); // RoomanTechnology
		System.out.println(str); // Rooman

		System.out.println();

		StringBuffer s2 = new StringBuffer("Rooman");
		System.out.println(s2); // Rooman
		s2.append("Technology");
		System.out.println(s2); // RoomanTechnology

	}
}
