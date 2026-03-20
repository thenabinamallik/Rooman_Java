package MyMultithread;
import static utils.printUtils.sop;

public class MyMainThread {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		sop(t1);
	}
}
