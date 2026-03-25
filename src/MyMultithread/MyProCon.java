package MyMultithread;

class Queue {
	int x;
	boolean is_data_present = false;

	public synchronized void store(int j) {
		try {

			if (!is_data_present) {
				x = j;
				System.out.println("Producer produced " + x);
				is_data_present = true;
				notify();
			} else {
				wait();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void retrieve() {
		try {

			if (is_data_present) {
				System.out.println("Consumer consumed " + x);
				is_data_present = false;
				notify();
			} else {
				wait();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Producer extends Thread {
	Queue q;

	public Producer(Queue k) {
		q = k;
	}

	public void run() {
		int i = 0;
		for (;;) {
			try {
				Thread.sleep(1000);
				q.store(i++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread {
	Queue b;

	public Consumer(Queue q) {
		b = q;
	}

	public void run() {
		for (;;) {
			try {
				Thread.sleep(1000);
				b.retrieve();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class MyProCon {
	public static void main(String[] args) {
		Queue q = new Queue();

		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

		p.start();
		c.start();
	}
}