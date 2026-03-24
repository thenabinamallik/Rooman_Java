package MyMultithread;
class MySyncThread extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        try {
            for (int i = 0; i <= 10; i++) {

                if (i >= 4 && i <= 7) {
                    synchronized (this) {
                        System.out.println(name + " LOCKED line " + i);
                        Thread.sleep(2000);
                    }
                } else {
                    System.out.println(name + " accessing line " + i);
                }

                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
public class MySyncBlock {

    public static void main(String[] args) {

        MySyncThread s = new MySyncThread();

        Thread t1 = new Thread(s, "Java");
        Thread t2 = new Thread(s, "AWS");
        Thread t3 = new Thread(s, "Cyber");

        t1.start();
        t2.start();
        t3.start();
    }
}