package com;
//overloading of run () can be done but thread .start() will always call the void run ();


class ThreadE extends Thread {
	public void run (int t) {
		System.out.println("this is arguemented run ()");
	}
	
	
	public void run () {
		for (int  i =0; i<10; i++)
		System.out.println("no arguement run ()");
	}
}


public class Case4 {

	public static void main(String[] args) {
		 
		ThreadE t = new  ThreadE();
		t.start();
		for (int i =0; i<10; i++)
			System.out.println("main thread");
	}

}
