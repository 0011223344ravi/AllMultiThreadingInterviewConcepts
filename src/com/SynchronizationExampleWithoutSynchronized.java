package com;
//irregular output
class Display1{
	
	public   void  wish(String name ) {
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

class MyThread2 extends Thread{
	
	Display1 d ;
	String name ;
	  MyThread2(Display1 d, String name ) {
		this.d=d;
		this.name = name ;
	}
	  
	  public void run () {
		 d.wish(name);
	  }
}


public class SynchronizationExampleWithoutSynchronized {

	public static void main(String[] args) {
		 
		Display1 d = new Display1();
		MyThread2 t1 = new  MyThread2(d,"Dhoni");
		MyThread2 t2 = new  MyThread2(d,"Yuvi");

	t1.start();
	t2.start();
	}


}
 
