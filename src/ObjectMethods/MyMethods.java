package ObjectMethods;
class Student{
	String name;
	int age;
	
	@Override
	public String toString() {
		return "Name: "+this.name+", Age: "+this.age;
	}
}

public class MyMethods {
	public static void main(String[] args) {
//		Student student = new Student();
//		student.name = "Nabin";
//		student.age = 22;
//		System.out.println(student);
		String string = new String("Rooman");
		System.out.println(string);
		
	}

}
