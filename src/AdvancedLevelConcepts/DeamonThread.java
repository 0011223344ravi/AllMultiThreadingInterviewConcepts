package AdvancedLevelConcepts;

public class DeamonThread extends Thread  {

	public void run () {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread()+"is deamon thread ");
		}
		
		else {
			System.out.println(Thread.currentThread()+"Normal Thread");
		}
	}
	public static void main(String[] args) {
		DeamonThread t1 = new DeamonThread();
		t1.setDaemon(true);
		DeamonThread t2 = new DeamonThread();
		DeamonThread t3 = new DeamonThread();
		DeamonThread t4 = new DeamonThread();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		

	}

}
