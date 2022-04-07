package com;

//other than synchronized static method, other threads can get the other methods.

class ShowResult {
	    public synchronized void displayA(String threadName) {
	    	for (int  i =0; i<10; i++) {
	    		System.out.println("displayA"+threadName);
	    		try {
					Thread .sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
		
	     }
	
         public synchronized void displayB(String threadName) {
        	 for (int  i =0; i<10; i++) {
 	    		System.out.println("displayB"+threadName);
 	    		try {
 					Thread .sleep(2000);
 				} catch (InterruptedException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
 				}
 	    	}
 		
      	}

         public void displayC(String threadName) {
        	 
        	 for (int  i =0; i<10; i++) {
 	    		System.out.println("displayC"+threadName);
 	    		try {
 					Thread .sleep(2000);
 				} catch (InterruptedException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
 				}
 	    	}
 		
	
        }
         
      public void displayD(String threadName) {
        	 
        	 for (int  i =0; i<10; i++) {
 	    		System.out.println("displayD"+threadName);
 	    		try {
 					Thread .sleep(2000);
 				} catch (InterruptedException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
 				}
 	    	}
	
}
}
//making 2 threads 

class MyDemothread1 extends Thread{
	ShowResult s ;
	String threadName;
	MyDemothread1(ShowResult s,String threadName){
		this.s = s;
		this.threadName= threadName;
	}
	
	public void run () {
		 
		
		 s.displayA(threadName);
		 s.displayC(threadName);
		
	}
}

class MyDemothread2 extends Thread{
	ShowResult s ;
	String threadName;
	MyDemothread2(ShowResult s,String threadName){
		this.s = s;
		this.threadName= threadName;
	}
	
	public void run () {
		 
		
		 s.displayA(threadName);
		 s.displayC(threadName);
		
	}
}
 

public class SynchronizationExampleCase4 {

	public static void main(String[] args) {
		ShowResult s = new ShowResult();
		
	  MyDemothread1 t1 = new MyDemothread1(s,"ravi");
	  MyDemothread2  t2 = new MyDemothread2(s,"kavi");
	  t1.start();
	  t2.start();

	}

}
