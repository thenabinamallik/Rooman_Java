package MyMultithread;

class WhiteBoard implements Runnable{
	@Override
	synchronized public void run() {
		String name = Thread.currentThread().getName();
		try {
			System.out.println(name+ " trying to access whiteboard");
			Thread.sleep(100);
			System.out.println(name+" git access to whiteboard");
			for(int i=1;i<=10; i++) {
				System.out.println(name+" writing on the board");
				Thread.sleep(100);
			}
			System.out.println(name+ " completed accessing the board");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

public class MySharedResources {
	public static void main(String[] args) {
		
	}
}
