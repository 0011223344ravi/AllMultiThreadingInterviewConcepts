package com;

class DemoThread5 extends Thread {
	public void run () {
	
	try{
		for (int i =0; i<10; i++) {
			System.out.println("lazy thread");
			 Thread.sleep(5000);
		}
	}
	catch (InterruptedException e) {
		System.out.println("lazy thread got interrupted "); 
	}
	}
}

public class SleepInterupptedExample {

	public static void main(String[] args) {
		DemoThread5 t = new DemoThread5();
		t.start();
		t.interrupt();
		System.out.println("end of main thread");

	}

}
