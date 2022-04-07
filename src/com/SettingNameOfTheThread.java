package com;

class ThreadDemo4 extends Thread {
public void run () {
		
		System.out.println("run method is invoked by the thread :-"+Thread.currentThread().getName());
		System.out.println("changing the name of the thread run method is invoked by as Ravi :-");
		Thread.currentThread().setName("Ravi");
		System.out.println("now run method is invoked by the thread :-"+Thread.currentThread().getName());
		
		
	}

	
}

public class SettingNameOfTheThread {

	 
		public static void main(String[] args) {
			ThreadDemo3 t = new ThreadDemo3();
			t.start();
			System.out.println("inside the main block let us see which thread is here :-"+Thread.currentThread().getName());
			System.out.println("changing the name of thread of  the main block let us as Baba :-");
			Thread.currentThread().setName("Baba");
			System.out.println("now main thread name :-"+Thread.currentThread().getName());
			
			  

		}	 

	

}
