package com;

class XYZ{
	
 
	public void display() {
	synchronized(XYZ.class) {
		for(int i =0; i<10; i++)
			  System.out.println("welcome" +Thread.currentThread());	
			}
	}
	
	
}


class ThreadXyz extends Thread{
	
	XYZ d ;
	ThreadXyz (XYZ d ){
		this.d =d;
	}
	public void run () {
	d.display();	 
	}
}

class ThreadXy extends Thread{
	
	XYZ d ;
	ThreadXy (XYZ d ){
		this.d =d;
	}
	public void run () {
	d.display();	 
	}
}
public class SynchronizedClassExample {
	

	public static void main(String[] args) {
		
		
	XYZ d = new XYZ();
	ThreadXy xy = new ThreadXy(d);
	ThreadXyz xyz = new ThreadXyz(d);
	xy.start();
	xyz.start();
	
	}

}
