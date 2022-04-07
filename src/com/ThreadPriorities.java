package com;
class ThreadDemo5 extends Thread {
	public void run () {
		
		System.out.println("child therad  priority "+Thread.currentThread().getPriority());
	}
}

public class ThreadPriorities {

	public static void main(String[] args) {
		
		ThreadDemo5 t = new ThreadDemo5();
		t.start();
		System.out.println("main thread "+Thread.currentThread().getPriority());
	}

}
