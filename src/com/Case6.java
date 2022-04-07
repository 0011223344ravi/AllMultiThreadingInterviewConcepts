package com;
//if we override start then our start will be called as a normal methods
//no thread is created
//so no child thread is created as we can see it in the output

class ThreadDemo extends Thread {
	
	public void start() {
		System.out.println("start method");
	}
	
	public void run() {
		for (int i =0; i<10; i++)
		System.out.println("child thread");
	}
}
public class Case6 {

	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		t.start();
		for (int i =0; i<10; i++)
			System.out.println("main thread");

	}

}
