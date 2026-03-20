package MyException;

import java.util.Scanner;

class UnderAgeException extends Exception{
	
	public UnderAgeException(String msg) {
		
		super(msg);
		
	}
	
}

class MyLicense{
	
	public void applyLicense() throws UnderAgeException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ur age:");
		int age = scan.nextInt();
		if(age<18) {
			throw new UnderAgeException("You are not eligible as you are below 18");
		}
		else {
			System.out.println("You are eligible for lincense.Kindly, collect it after 20 days");
		}

	}
	
}

public class MyOwnException {

	public static void main(String[] args) {
		
		MyLicense ml = new MyLicense();
		try {
			ml.applyLicense();
		} 
		catch (UnderAgeException e) {
			
			System.out.println(e.getMessage());
			
		}

	}

}