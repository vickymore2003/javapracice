package Multithreading;

public class CreationOfThreadusingRunnableInterface implements Runnable{
	
	
	public static void main(String[] args) {
		
		//Runnable r=new CreationOfThreadusingRunnableInterface();   //this is also correct
		CreationOfThreadusingRunnableInterface r=new CreationOfThreadusingRunnableInterface();
		Thread t=new Thread(r);
		t.start();
		t.run();
		
	}//

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		System.out.println("thread is running");
		
	}
}
