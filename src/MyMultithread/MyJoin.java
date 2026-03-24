package MyMultithread;

class MyAlpha extends Thread {
	@Override
	public void run() {

		System.out.println("MyAlpha thread started");
		for (char c = 65; c <= 75; c++) {

			try {

				System.out.println(c);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("MyAlpha Thread ended");
		}

	}
}

public class MyJoin {

	public static void main(String[] args) {
		System.out.println("Main thread started");
		System.out.println("database connection established");
		MyAlpha myAlpha = new MyAlpha();
		try {
			myAlpha.start();
			myAlpha.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("database connection terminated");
		System.out.println("Main thread completed");

	}

}