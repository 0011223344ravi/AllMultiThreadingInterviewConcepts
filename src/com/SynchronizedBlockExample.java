package com;

//this is also know as object level lock
class ABC{
public  void DisplayMessage() {
		
	System.out.println("1000 lines of code "+Thread.currentThread());
	synchronized (this)
	
	{
		for (int i =0;i<10; i++)System.out.println("abc"+Thread.currentThread());}
	
	System.out.println("2000 line of code "+Thread.currentThread());
	}
}

class ThreadD extends Thread{
	ABC d ;
	ThreadD(ABC d){
		this.d =d ;
	}
	
	
	public void run () {
		d.DisplayMessage();
	}
}

class ThreadDA extends Thread{
	ABC d ;
	ThreadDA(ABC d){
		this.d =d ;
	}
	
	
	public void run () {
		d.DisplayMessage();
	}
}
public class SynchronizedBlockExample {
	
	

	public static void main(String[] args) {
		
		ABC d = new ABC();
		 
     ThreadD t = new ThreadD(d);
     ThreadDA t1 = new ThreadDA(d);
     t.start();
     t1.start();
	}

}
