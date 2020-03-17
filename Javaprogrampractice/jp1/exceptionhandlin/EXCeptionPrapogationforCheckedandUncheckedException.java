package exceptionhandlin;

import java.io.IOException;

public class EXCeptionPrapogationforCheckedandUncheckedException {

	//Rule: By default, Checked Exceptions are not forwarded in calling chain (propagated). but with help of throws keyword u can propogate it
	//Rule: By default Unchecked Exceptions are forwarded in calling chain (propagated).
	 void m() throws IOException{  
		    
				throw new java.io.IOException("device error");// if try catch not here compile time error come or should throws it at method level
			
	//if ur throwing exception using throw then u must throws it at method level else catch it in try and catch
				
				
	
//Rule: If you are calling a method that declares an exception, you must either caught or declare the exception.
				
			//	There are two cases:
			//		Case1:You caught the exception i.e. handle the exception using try/catch.
			//		Case2:You declare the exception i.e. specifying throws with the method.

//) Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.
//2) Rule: If the superclass method does not declare an exception, subclass overridden method 
	//			cannot declare the checked exception but can declare unchecked exception.				
//1) Rule: If the superclass method declares an exception, subclass overridden method can declare same,
//subclass exception or no exception but cannot declare parent exception.				
				
				
				
				
				
				
		  }  
		  void n() throws IOException{  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handeled");}  
		  }  
		  public static void main(String args[]){  
			  EXCeptionPrapogationforCheckedandUncheckedException obj=new EXCeptionPrapogationforCheckedandUncheckedException();  
		   obj.p();  
		   System.out.println("normal flow");  
		  }  
}
