package Multithreading;

public class CreationOfThreadusingThreadClass extends Thread {

	
	//2 ways to create a thread in java
	// extending thread class 
	// implemeting the runnable interface.
	
	@Override
	public void run(){
		
		System.out.println("running threading");
		
	}
	
	public static void main(String[] args) {
		
		
		CreationOfThreadusingThreadClass t=new CreationOfThreadusingThreadClass();//thread is in new state
		System.out.println(Thread.currentThread().getName());
		t.start();                // goes in ready to execute statte. i.e runnable state
		
		t.run();  // running state.
		
		System.out.println(Thread.currentThread().getName());
		
		
		 }
	
	
	
	
}
