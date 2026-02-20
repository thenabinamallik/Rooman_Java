package assignment;

public class Demo {
	public int add(int x,int y) {
		x=500;
		y=300;
		int sum=x+y;
		System.out.println(x);
		System.out.println(y);
		return sum;
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		int a=100;
		int b=200;
		System.out.println("value of a before"+a);
		System.out.println("value of b before"+b);
		int res=d.add(a, b);
		System.out.println(res);
		System.out.println("value of a after"+a);
		System.out.println("Value of b after"+b
				);
	}

}
