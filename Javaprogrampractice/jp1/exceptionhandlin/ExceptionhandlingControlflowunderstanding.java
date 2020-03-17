package exceptionhandlin;

public class ExceptionhandlingControlflowunderstanding {

	public static void validate(){
		
		throw new ArithmeticException("hello");
	}
	
	
	public static void main(String[] args) {
		try{
		validate();
		}catch(ArithmeticException e){
			e.getMessage();
			
		}
	}
	
	
}

