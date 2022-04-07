package com;
//if thread t1 wants to wait until t2 completed then t1 need to call t2.join()
//t1 will goto waiting state after that
//after t2 completion t1 get its chance and completes

class ThreadDemo6 extends Thread{
	public void run() {
		for (int i =0; i<10; i++) {
		System.out.println("child thread");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
	}
}
	}
public class RunExample {

	public static void main(String[] args) throws InterruptedException {
		 
   ThreadDemo6 t = new ThreadDemo6();
   t.start();
   t.join();
   for (int i =0; i<10; i++)
	   System.out.println("Main thread");
		
	}

}
