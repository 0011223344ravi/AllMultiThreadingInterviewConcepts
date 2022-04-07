package com;
//calling start method 2nd time will give RE:-IllegalThreadStateException

class ThreadDemo2 extends Thread {
	
}
public class Case8 {

	public static void main(String[] args) {
		ThreadDemo2 t= new ThreadDemo2();
		t.start();
		t.start();

	}

}
