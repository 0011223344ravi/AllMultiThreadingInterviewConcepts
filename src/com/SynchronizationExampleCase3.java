package com;
//same as case2 but the method is static synchronized and we get the regular output//its get us class level lock
//in that scenario the thread uses the class level lock and so we get the regular output
//case 4 :->other than synchronized static method, other threads can get the other methods.


class Dispa {
	public static synchronized void wish (String name) {
	for (int i =0; i<10; i++)
	{
		System.out.println("Welcome "+name);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
	
}


class ThreadAA extends Thread {
	
	Dispa d ;
	String name ;
	ThreadAA(Dispa d , String name){
		this.d=d;
		this.name= name ;
	}
	
	public void run () {
		d.wish(name);
	}
	
}

public class SynchronizationExampleCase3 {

	public static  void main(String[] args) {
		Dispa d1 = new Dispa();
		Dispa d2 = new  Dispa();
		ThreadAA t1 = new ThreadAA(d1, "Dhoni");
		ThreadAA t2 = new ThreadAA(d2, "Yuvi");
		t1.start();
		t2.start();

	}

}

 
