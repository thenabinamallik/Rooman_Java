package Program;

public class MyPro2 {
	public static void main(String[] args) {
		MyChar.mycharprint();
	}
}

class MyChar {
	public static void mycharprint() {
		String t = "";
		for (char i = 65; i <= 75; i++) {
			t=t+i;
			System.out.println(t);
		}
	}
}

