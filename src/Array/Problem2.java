package Array;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		int number_of_students;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of students : ");
		number_of_students = scan.nextInt();
		
		String[] students_names = new String[number_of_students];
		
		for(int i = 0; i<students_names.length; i++) {
			System.out.print("Enter the student name : ");
			students_names[i] = scan.next();
		}
		System.out.println();
		System.out.println("Students are :");
		for(int i = 0; i<students_names.length; i++) {
			System.out.println("\t"+students_names[i]);
			
		}
	
		
	}
}
