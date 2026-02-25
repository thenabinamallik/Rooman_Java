package Encapsulation;

public class Car {
	
	public static void main(String[] args) {
		Props bmw = new Props(220, 18);
//		System.out.println(bmw.getMileage());
		
	}

}

class Props{
	int speed;
	int mileage;
	
	public Props(int speed, int mileage){
//		this.speed = speed;
//		this.mileage = mileage;
		this();
		System.out.println("Parameter");
	}
	public Props(){
		System.out.println("No Parameter");
	}


	public int getMileage() {
		return mileage;
	}

	public int getMileage(int mileage) {
		return mileage;
	}
	
	
}