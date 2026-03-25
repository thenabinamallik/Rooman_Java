package MyMultithread;

public class MyInterrupt {
	static class MyBeta extends Thread {
		@Override
		public void run() {
			for (int i = 1; i <= 10; i++) {
				try {
					if ((i>=4)&&(i<=7)) {
						Thread.currentThread().interrupt();
					} else {
						Thread.sleep(1000);
						System.out.println("Line " + i);
					}
				} catch (InterruptedException e) {
					System.out.println("Interrupted");
				}
			}
		}
	}
	public static void main(String[] args) {
		MyBeta b = new MyBeta();
	    b.start();
	}
}
