package MyException;
import java.util.InputMismatchException;
import java.util.Scanner;
import static utils.printUtils.sop;

class Demo3{
	public void m3() {
		Scanner scan = new Scanner(System.in);
		sop("Connection4 established");
//		try {
			sop("Enter your age");
			int age = scan.nextInt();
			sop("Age entered is "+age);
//		} catch (InputMismatchException e) {
//			System.out.println("Input can't be String");
//			System.out.println("Exepception handed in M3");
//		}
		sop("Connection4 terminated");
	}
}

class Demo2{
	public void m2() {
		sop("Connection3 established");
//		try {
			Demo3 d3=new Demo3();
			d3.m3();
//		} catch (InputMismatchException e) {
//			System.out.println("Input can't be String");
//			System.out.println("Exepception handed in M2");
//		}
		System.out.println("Connection3 terminated");
	}
}

class Demo1{
	public void m1() {
		sop("Connection2 established");
		try {
			Demo2 d2=new Demo2();
			d2.m2();
		} catch (InputMismatchException e) {
			sop("Input can't be String");
			sop("Exepception handed in M1");
		}
		sop("Connection2 terminated");
	}
}

public class MyExceptionProp {
	public static void main(String[] args) {
	sop("Connection1 established");
	Demo1 d1=new Demo1();
	d1.m1();
	sop("Connection1 terminated");
	sop("");
//	main(args);
	}
}



// There are 3 ways :
// 1. Handling and Exception (try, catch)
// 2. Re-through Exception (try, catch, throw, throws, finally)
// 3. Ducking an Exception (throw, throws)
