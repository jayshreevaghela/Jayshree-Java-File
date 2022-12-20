package javaproject;

class NewThread1 extends Thread
{

	public NewThread1() {
		
		super("Child Thread");
		start();
	}

	public void run() {
		
		for(int i=0;i<5;i++)
		{
			System.out.println(this+" : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("Child Thread Exiting");
	}
	
}
public class CreatingThread_Extending_Demo {
	
	public static void main(String[] args) throws Exception {
		
		new NewThread1();
		Thread t= Thread.currentThread();
		for(int i=0;i<5;i++)
		{
			System.out.println(t+" : "+i);
			Thread.sleep(3000);
		}
		System.out.println("Main Thread Exiting");
	}

}

