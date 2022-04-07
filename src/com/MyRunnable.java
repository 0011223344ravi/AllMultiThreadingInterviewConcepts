package com;


class RunnableExample implements Runnable{

	@Override
	public void run() {
		for (int i =0; i<10; i++)
	System.out.println("child thread");
		
	}
	
}

public class MyRunnable   {

	public static void main(String[] args) {
	 Thread t = new Thread(new RunnableExample());
	 
	 t.start();
	 for (int i =0; i<10; i++)
			System.out.println("main thread");

	}
	
	

}
