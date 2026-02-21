package Tasks;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		int emp_num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of employees: ");
		emp_num = scan.nextInt();
		
		double[] salary = new double[emp_num];
		String[] emp_name = new String[emp_num];
		
		for(int i = 0; i<emp_num; i++) {
			System.out.print("Enter the Emp Name : ");
			emp_name[i] = scan.next();
			
			System.out.print("His Salary: ");
			salary[i] = scan.nextDouble();
		}
		
		System.out.println();
		
		for(int i = 0; i<emp_num; i++) {
			System.out.println(emp_name[i]+" has salary :"+salary[i]);
		}
		
		
		
		
	}
}
