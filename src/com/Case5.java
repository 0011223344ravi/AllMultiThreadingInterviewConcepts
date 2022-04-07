package com;
//we should override the run () otherwise will get the empty implementation
//no output is achieved

class ThreadEx extends Thread {
	
}
public class Case5 {

	public static void main(String[] args) {
		 
		ThreadEx t = new  ThreadEx();
		t.start();
	}

}
