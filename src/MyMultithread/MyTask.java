package MyMultithread;

import static utils.printUtils.sop;
import static utils.printUtils.sop_ln;

public class MyTask {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			sop(i+" ");
		}
		sop_ln("");
		for (int i = 65; i < 91; i++) {
			Thread.sleep(500);
			sop((char) i + " " );
		}
		sop_ln("");
		for (int i = 1; i <= 10; i++) {
			Thread.sleep(500);
			sop_ln("2 x " + i + " = " + (2 * i));
		}

	}

}
