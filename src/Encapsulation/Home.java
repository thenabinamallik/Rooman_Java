package Encapsulation;

public class Home {
	public static void main(String[] args) {
		Tv t = new Tv(50,60);

		System.out.println("TV's volume is " + t.getVolume());
		System.out.println("TV's brightness is " + t.getBrightness());
	}
}













class Tv {  
	private int volume;
	private int brightness;

//	public Tv() { 
//	
//		//1- Zero parameter constructor
//		//2- No argument constructor
//		//3- Default constructor
//		
//		System.out.println("Tv object created.");
//	}
	
	
	
	
// Parameterised  Constructor
	public Tv(int volume, int brightness) { 
		System.out.println("Tv object is getting created.");
		if(volume <= 50 && brightness <= 60) {
			this.brightness = brightness;
			this.volume = volume;
		}
		else {
			System.out.println("Volume & Brightness should"
					+ " be lesser that 50 & 60");
		}
	}
	
	
	
	
	
	
	public void watchMovie() {
		System.out.println("Watching movie in tv");
	}

	public int getVolume() {
		return volume;
	}

	public int getBrightness() {
		return brightness;
	}





}