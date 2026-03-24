package MyMultithread;

class MyMainThreadUtils extends Thread{
	@Override
	public void run() {
		for(int i = 1; i<= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Main Activaty Exicuting");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyDemo extends Thread {
	@Override
	public void run() {
		for (;;) {
			try {
				Thread.sleep(1000);
				System.out.println("Daemon Thread supporing main task"+);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MyUsers {
	public static void main(String[] args) {
		System.out.println("Main Thread started");
//		MyMainThreadUtils m1 = new MyMainThreadUtils();
//		MyDemo u1 = new MyDemo();
//		u1.setDaemon(true);
//		u1.start();
//		m1.start();
		
		Thread autoSave = new Thread(()->{
			for(;;) {
				try {
					Thread.sleep(100);
					System.out.println("autosaving...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread typing = new Thread(()->{
			for(int i = 1; i<=10; i++) {
				try {
					Thread.sleep(100);
					System.out.println("Typed!");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread autoComplete = new Thread(()->{
			for(;;) {
				try {
					Thread.sleep(100);
					System.out.println("autocompleted");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		autoSave.setDaemon(true);
		autoComplete.setDaemon(true);
		
		autoComplete.start();
		typing.start();
		autoSave.start();
		
		System.out.println("Main Thread ended");
	}
}

