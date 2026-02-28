package Constructor;

public class MySettet {
	public static void main(String[] args) {
		Auto a =  new Auto("Bajaj");
		a.setName("tata");
		System.out.println(a.getName());
	}
}

class Auto{
	String name;
	public Auto(String name) {
		this.name = name;	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}