package variable;

public class Demo {

	String name = "Nabin";
	int age = 25;
	float salary = 400000f;
	boolean isMarried = false;

	public static void main(String[] args) {
		Demo demo = new Demo();
		
		System.out.println(demo.name);
		System.out.println(demo.age);
		System.out.println(demo.salary);
		System.out.println(demo.isMarried);
	}
}
