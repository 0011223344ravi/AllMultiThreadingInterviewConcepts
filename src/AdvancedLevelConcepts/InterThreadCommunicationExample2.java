package AdvancedLevelConcepts;

public class InterThreadCommunicationExample2 {
	public static void main(String args []) {
	
		
		A t1 = new A();
		B t2 = new B();
		t1.start();
		t2.start();
	}
	

}
class B extends Thread{
	synchronized void Deposit() {
		   
		   System.out.println("going for deposit");
		   notify();
		   
		   
		   	 
	   }
	public void run () {
		B b = new B();
		b.Deposit();
	
		
	}
}

class A extends Thread{
	
	
   synchronized void withdarw() {
	   
	   System.out.println("going for withdrawal");
	   
	  try {
		wait(2000);
	} catch (InterruptedException e) {
		 System.out.println("inside wait");
		e.printStackTrace();
	}
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	};
	  System.out.println("got call from notify ");
		 
   }
   


public void run () {
	A a = new A();
	a.withdarw();
	 
}
}

 
