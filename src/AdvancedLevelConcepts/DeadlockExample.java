package AdvancedLevelConcepts;

class C {
	
	public synchronized void d1(D d) {
		System.out.println("inside class C d1 method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 1 trying to call D last method");
		d.last();
		}
	
	public synchronized void last() {
		System.out.println("inside C last method");
	}
	
	
}


class D{
	
	public synchronized void d2(C c) {
		System.out.println("inside class D d2 method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
		System.out.println("Thread 2 trying to call C last method");
		c.last();
		}
	public synchronized void last() {
		System.out.println("inside D last method");
	}
	
	
}
public class DeadlockExample extends Thread {
C c = new C();
D d = new D();
public void m1() {
	this.start();
	c.d1(d);
	
}

public void run() {
	d.d2(c);
}

	public static void main(String[] args) throws InterruptedException {
		 
		DeadlockExample t1 = new DeadlockExample();
		t1.m1();
	}

}


