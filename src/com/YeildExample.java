package com;
//yeild cause passing of current thread execution to waiting thread of same priority 
//if all waiting is of low then it will continue its execution 

class DemoThread extends Thread{
	
	public void run() {
		
		for(int  i =0; i<10; i++)
		System.out.println("child thread");
		Thread.yield();
		
	}
}

public class YeildExample {

	public static void main(String[] args) {
		
		
		DemoThread t = new DemoThread();
		t.start();
		for (int i =0; i<10; i++)
			System.out.println("main thread");

	}

}
