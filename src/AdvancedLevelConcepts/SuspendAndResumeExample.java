package AdvancedLevelConcepts;

public class SuspendAndResumeExample extends Thread  {
	public void run () {
		for(int i =0; i<10; i++)
		System.out.println("Suspend and Resume Example");
	}

	public static void main(String[] args) {
		 
		SuspendAndResumeExample t1 = new SuspendAndResumeExample();
		t1.start();
		t1.suspend();
		t1.resume();
	}

}
