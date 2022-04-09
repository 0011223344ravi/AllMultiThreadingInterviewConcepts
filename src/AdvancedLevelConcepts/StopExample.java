package AdvancedLevelConcepts;

public class StopExample extends Thread {

	
	public void run() {
		for (int i =0; i<10; i++)System.out.println("Stop example");
	}
	public static void main(String[] args) {
		 StopExample se = new StopExample();
		 se.start();
		 
		 System.out.println("main thread");
		 se.stop();
	}

}
