package Program;

class MyPrint {
	public static void printA() {
		System.out.println("Printing Alphabet LowerCase");
		for(int i =65; i<=90; i++) {
			System.out.println((char)(i+32));
		}
	}
	public static void printa() {
		System.out.println("Printing Alphabet UpperCase");
		for(int i =97;i<=122; i++) {
			System.out.println((char)(i-32));
		}
	}
}

public class MyPro{
	public static void main(String[] args) {
		MyPrint.printA();
		MyPrint.printa();
	}
}

