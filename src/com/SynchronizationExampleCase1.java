package com;
//with help of synchronized keyword we are getting regular output

class Display{
	
	public synchronized void  wish(String name ) {
		for (int i =0; i<10; i++) {
			System.out.println("Good Morning"+name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class MyThread1 extends Thread{
	
	Display d ;
	String name ;
	  MyThread1(Display d, String name ) {
		this.d=d;
		this.name = name ;
	}
	  
	  public void run () {
		 d.wish(name);
	  }
}

public class SynchronizationExampleCase1 {

	public static void main(String[] args) {
		 
		Display d = new Display();
		//both threads are working on the same object "d" so synchronization is required
	MyThread1 t1 = new  MyThread1(d,"Dhoni");
	MyThread1 t2 = new  MyThread1(d,"Yuvi");

	t1.start();
	t2.start();
	}

}
