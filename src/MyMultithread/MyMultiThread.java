package MyMultithread;

import static utils.printUtils.sop_ln;

class Task1 extends Thread {
	public void printNum() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				sop_ln(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class Task2 extends Thread {
	public void printCharA() {
		for (int i = 65; i < 91; i++) {
			try {
				Thread.sleep(500);
				sop_ln((char) i + " ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
	public void printChara() {
		for (int i = 97 ; i < 123; i++) {
			try {
				Thread.sleep(500);
				sop_ln((char) i + " ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class Task3 extends Thread {
	public void printTable() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
				sop_ln("2 x " + i + " = " + (2 * i));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

public class MyMultiThread {
	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> {
			Task1 t1 = new Task1();
			t1.printNum();
		});
		Thread thread2 = new Thread(() -> {
			Task2 t2 = new Task2();
			t2.printCharA();
			t2.printChara();
		});
		Thread thread3 = new Thread(() -> {
			Task3 t3 = new Task3();
			t3.printTable();
		});

		thread1.start();
		thread2.start();
		thread3.start();
	}
}
