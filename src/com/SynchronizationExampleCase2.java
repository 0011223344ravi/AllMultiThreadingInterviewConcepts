package com;

//case 2 multiple threads are working on multiple objects 
//its safe execution but the output is irregular

class Disp {
	public synchronized void wish (String name) {
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


class ThreadA extends Thread {
	
	Disp d ;
	String name ;
	ThreadA(Disp d , String name){
		this.d=d;
		this.name= name ;
	}
	
	public void run () {
		d.wish(name);
	}
	
}
public class SynchronizationExampleCase2 {

	public static void main(String[] args) {
		Disp d1 = new Disp();
		Disp d2 = new  Disp();
		ThreadA t1 = new ThreadA(d1, "Dhoni");
		ThreadA t2 = new ThreadA(d2, "Yuvi");
		t1.start();
		t2.start();

	}

}
