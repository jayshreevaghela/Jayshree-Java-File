package javaproject;


class NewThread implements Runnable
{

	
	Thread t;
	
	public NewThread() {
		
		t=new Thread(this,"Child Thread");
		t.start();
	}

	public void run() {
		
		for(int i=0;i<5;i++)
		{
			System.out.println(t+" : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("Child Thread Exiting");
	}
	
}
public class CreatingThread_Runnable_Demo {
	public static void main(String[] args) throws Exception {
		
		new NewThread();
		Thread t= Thread.currentThread();
		for(int i=0;i<5;i++)
		{
			System.out.println(t+" : "+i);
			Thread.sleep(3000);
		}
		System.out.println("Main Thread Exiting");
	}

}
