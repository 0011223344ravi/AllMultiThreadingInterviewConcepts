package com;
//if we use t.run() then multi threading is not achieved 
//its a simple method call

class ThreadExm extends Thread {
	
	public void run () {
		for (int i =0; i<10; i++) {
		
		System.out.println("child thread");
	}
		
}
}

public class Case2 {

	public static void main(String[] args) {
		ThreadExm t = new ThreadExm();
		t.run();
		for (int i =0; i<10; i++)
			 System.out.println("main thread");

	}

}
