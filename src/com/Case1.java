package com;
//normal therad class scenario:-case1
class ThreadExmpl extends Thread {
	
	public void run () {
		for (int i =0; i<10; i++)
		System.out.println("child thread ");
	}
}

public class Case1 {

	public static void main(String[] args) {
		 
		ThreadExmpl t = new ThreadExmpl();
		t.start();
		for (int i =0; i<10; i++) {
			System.out.println("main thread");
			
		}
	}

}
