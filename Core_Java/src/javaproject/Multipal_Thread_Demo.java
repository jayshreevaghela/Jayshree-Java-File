package javaproject;

class NewThread2 implements Runnable
{

	
	Thread t;
	String tname;
	
	public NewThread2(String tname) {
		this.tname=tname;
		t=new Thread(this,tname);
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
public class Multipal_Thread_Demo {
	public static void main(String[] args) throws Exception {
		
		new NewThread2("One");
		new NewThread2("Two");
		new NewThread2("Three");
		
		Thread t= Thread.currentThread();
		for(int i=0;i<5;i++)
		{
			System.out.println(t+" : "+i);
			Thread.sleep(1000);
		}
		System.out.println("Main Thread Exiting");
	}

}
