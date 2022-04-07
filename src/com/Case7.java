package com;
//creating a start method and calling parent start method in that
//that will work like a normal multi threading example

class ThreadDemo1 extends Thread {
	public void start() {
		super.start();
		System.out.println("inside start method after super.start()");
	}
	
	public void run() {
		System.out.println("child thread");
	}
}

public class Case7 {

	public static void main(String[] args) {
		 
		ThreadDemo1 t = new ThreadDemo1();
		t.start();
		System.out.println("main thread");
	}

}
