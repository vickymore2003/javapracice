package throwexecptionfromcatch;

import java.io.File;
import java.io.FileReader;

public class throwexceptionfromcatch {

	public static void main(String[] args) {
		
		try{
			
			System.out.println("1");
			File f=new File("C:\\Users\\jfundes\\Desktop\\kk.txt");
			FileReader f1=new FileReader(f);
		
			
		}catch(Exception e){
			System.out.println("in catch");
			System.out.println(e.getMessage());
			//  System.out.println(1/0);   program will get termintaed here if this statement will get executed because no one handles it so jvm handles it by throwing the
			// exception and terminating the program.
			try{
			System.out.println(1/0);
			}catch(Exception e1){
				System.out.println(e1.getMessage());
				
			}
		}finally{
			System.out.println("finally");
		}
		
		System.out.println("after finally");
		
	}
	
	
}
