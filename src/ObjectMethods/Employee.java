package ObjectMethods;

import java.util.Objects;

public class Employee {
	String emp_name, emp_city;
	int emp_id, emp_salary;
	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", emp_city=" + emp_city + ", emp_id=" + emp_id + ", emp_salary="
				+ emp_salary + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(emp_city, emp_id, emp_name, emp_salary);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(emp_city, other.emp_city) && emp_id == other.emp_id
				&& Objects.equals(emp_name, other.emp_name) && emp_salary == other.emp_salary;
	}



	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.emp_name = "Nabina Mallik";
		emp.emp_city = "Dhenkanal";
		emp.emp_id = 2101214106;
		emp.emp_salary = 1200000;
		System.out.println(emp);
		
		Employee emp1 = new Employee();
		emp1.emp_name = "Nabina Mallik";
		emp1.emp_city = "Dhenkanal";
		emp1.emp_id = 2101214106;
		emp1.emp_salary = 1200000;
		System.out.println(emp1);
		
		System.out.println(emp == emp1);
		System.out.println(emp.equals(emp1));
		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
	}
}
