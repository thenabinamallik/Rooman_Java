package MyException;
import java.util.Scanner;

class UnderAgeException extends Exception{

    public UnderAgeException(String message){

        super(message);

    }

}

class MyLicence{
    public void applyLicence() throws UnderAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age<18){
            throw new UnderAgeException("You are not eligible as you are bellow 18");
        }
        else{
            System.out.println("You are eligible for the license. Kindly collect it after 20 days");
        }
    }
}


public class MyCustomException {
    public static void main(String[] args) throws UnderAgeException {
        MyLicence myLicence = new MyLicence();
        myLicence.applyLicence();
    }

}