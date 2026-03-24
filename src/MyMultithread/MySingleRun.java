package MyMultithread;

class Test extends Thread
{
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		if(name.equals("printchar"))
		{
			printChar();
		}
		else if(name.equals("printnum"))
		{
			printNum();
		}
		else {
			printTab();
		}
		
		
	}
	
	public void printNum()
	{
		System.out.println("Printing Number");
		for(int a=65;a<=75;a++)
		{
			try {
				Thread.sleep(1000);
				System.out.println(a);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void printTab()
	{

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("2 x " + i + " = " + (2 * i));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 

		}
	}
	
	public void printChar()
	{
		System.out.println("Printing character");
		for(char a=65;a<=75;a++)
		{
			try {
				Thread.sleep(1000);
				System.out.println(a);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MySingleRun {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		t1.setName("printnum");
		t2.setName("printchar");
		t3.setName("printtab");
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}