package com;

class ThreadExample extends Thread{
	public void run() {
		for (int i =0; i<10; i++)
		System.out.println("child thread");
	}
	
}

public class MyThread   {
	 

	public static void main(String[] args) {
	
		ThreadExample t = new ThreadExample();
		t.start();
		for(int i =0; i<10; i++) {
			System.out.println("main thread");
		}
		 
             
	}

}
