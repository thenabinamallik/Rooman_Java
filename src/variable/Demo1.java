package variable;
import java.util.Scanner;
public class Demo1 {

	int num1, num2;
	String c;

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the First Number");
		d.num1 = scan.nextInt();
		System.out.println("Enter the Second Number");
		d.num2 = scan.nextInt();
		System.out.println("Choose the operation : + - * /");
		d.c = scan.next();

		System.out.println("Hello World!");

	}

}
