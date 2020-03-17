package exceptionhandlin;


class customexeception extends Exception{
	
	public customexeception(String messge) {
		// TODO Auto-generated constructor stub
	
	super(messge);
	
	}
		
	
	
}

public class CustomExceptionhandling {

	public static void validate() throws customexeception{
		
		if(1<2){
			
			throw new customexeception("invalid");
			
		}
		
	}
	
	public static void main(String[] args) {
	try{	
	validate();
		
	}catch(customexeception e){
		
		System.out.println(e.getMessage());
	}
	}
	
}
