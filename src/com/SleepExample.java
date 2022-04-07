package com;
class DemoThread4 extends Thread{
	
	public void run () {
		for (int i =0; i<10; i++) {
			System.out.println("lazy thread");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class SleepExample {

	public static void main(String[] args) {
		DemoThread4 t = new DemoThread4();
		t.start();
		 

	}

}
