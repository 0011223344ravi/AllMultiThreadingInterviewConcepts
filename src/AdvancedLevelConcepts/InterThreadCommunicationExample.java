package AdvancedLevelConcepts;

class ThreadDemo extends Thread{
	
	 int total =0;
	 public void run () {
		 synchronized (this) {
			 System.out.println("child thread starts calculation");
			 for(int i =1; i<100; i++) {
				 total = total+i;
			 }
			 System.out.println("child thread giving notifications");
			 
			 Thread.currentThread().notify();
		}
	 }
	
}

public class InterThreadCommunicationExample {

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo b = new ThreadDemo();
		b.start();
		Thread.sleep(2000);
		synchronized (b) {
			System.out.println("main thread start calling wait method");
			b.wait();
			System.out.println("main thread got notifications");
			System.out.println("total :->"+b.total);
			
		}

	}

}
