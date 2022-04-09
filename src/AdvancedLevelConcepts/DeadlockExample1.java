package AdvancedLevelConcepts;

public class DeadlockExample1 {

	public static void main(String[] args) {
		
	final String S1= "Ravi";
	final String S2= "Kavi";
		
       Thread t1 = new Thread() {
    	   public void run() {
    		synchronized (S1) {
    			System.out.println("thread 1 is using s1 ");
    			try {
    				Thread.sleep(2000);
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
        		synchronized (S2) {
        			
        			System.out.println("thread 1 is asking for s2");
        		}
    		}
    		
    	   }
       };
       Thread t2 = new Thread () {
    	   
    	   public void run() {
       		synchronized (S2) {
       			System.out.println("thread 2 is using s2 ");
       			try {
       				Thread.sleep(2000);
       			} catch (InterruptedException e) {
       				// TODO Auto-generated catch block
       				e.printStackTrace();
       			}
           		synchronized (S1) {
           			
           			System.out.println("thread 2 is asking for s1");
           		}
       		}
       		
       	   }
       };
       
       t1.start();
       t2.start();
	}

}
