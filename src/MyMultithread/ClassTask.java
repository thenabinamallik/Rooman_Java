package MyMultithread;

public class ClassTask {
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			for(int i = 1; i<=10; i++) {
				try {
					Thread.sleep(500);
					System.out.println("2 x "+i+" = "+ (2*i));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(()->{
			for(int i = 1; i<=10; i++) {
				try {
					Thread.sleep(700);
					System.out.println("3 x "+i+" = "+ (3*i));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t3 = new Thread(()->{
			for(int i = 1; i<=10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("4 x "+i+" = "+ (4*i));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		System.out.println("Started");
		System.out.println();
		try {
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Ended");
		
	}
}
