package com;

//
 
class DemoThread2 extends Thread{
	public void run () {
		
		for(int i =0;i<10; i++) {
		
		System.out.println("child1 thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		 
	}
}
class DemoThread3 extends Thread{
	public void run () {
		for(int  i =0; i<10; i++) {
		System.out.println("child2 thread");
		 
		}
		 
	}
}
public class RunExample2 {

	//DemoThread2 mt =  Thread.currentThread();  
	
	public static void main(String[] args) throws InterruptedException {
    DemoThread2 t1 = new DemoThread2();
    DemoThread3 t2 = new DemoThread3();
	t1.start();
	t1.join();
	t2.start();
	
	 
	
	}

}
