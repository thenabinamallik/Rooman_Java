package Tasks;

public class Home2 {
	public static void main(String[] args) {
		Fan f = new Fan(5);
		System.out.println("Speed of the Fan is " + f.getSpeed());

	}

}

class Fan {
	private int speed;
	
	public Fan(int speed) {
		this.speed = (speed <= 5) ? speed : this.speed;
		System.out.println((speed <= 5) ? "Speed set successfully" : "Exceeded the maximum speed.");
	}

	public int getSpeed() {
		return speed;
	}

//	public void setSpeed(int speed) {
//		this.speed = (speed <= 5) ? speed : this.speed;
//		System.out.println((speed <= 5) ? "Speed set successfully" : "Exceeded the maximum speed.");
//	}

}
