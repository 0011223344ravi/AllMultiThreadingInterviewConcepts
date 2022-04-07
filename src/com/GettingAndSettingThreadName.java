package com;

class ThreadDemo3 extends Thread {
	
	
	public void run () {
		
		System.out.println("run method is invoked by the thread :-"+Thread.currentThread().getName());
	}
	
}

public class GettingAndSettingThreadName {

	public static void main(String[] args) {
		ThreadDemo3 t = new ThreadDemo3();
		t.start();
		System.out.println("inside the main block let us see which thread is here :-"+Thread.currentThread().getName());
		  

	}

}
