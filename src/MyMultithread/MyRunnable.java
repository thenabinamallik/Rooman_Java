package MyMultithread;

class MyTaskChar implements Runnable {

	@Override
	public void run() {
		for (char c = 65; c <= 75; c++) {
			try {
				Thread.sleep(1000);
				System.out.println(c);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyTaskNum implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyTaskTab extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("2 x " + i + " = " + (2 * i));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MyRunnable {

	public static void main(String[] args) {
		MyTaskChar t1 = new MyTaskChar();
		MyTaskNum t2 = new MyTaskNum();
		MyTaskTab t3 = new MyTaskTab();

		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
//		Thread th3 = new Thread();
		Thread th4 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("3 x " + i + " = " + (3 * i));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread th5 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("4 x " + i + " = " + (4 * i));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		

		th1.start();
		th2.start();
		t3.start();
		th4.start();
		th5.start();

	}

}
