package Stringvalueofmethod;

public class stringvalueofmethod {

	/* The java string valueOf() method converts different types of values into string. By the help of string valueOf() method, 
	you can convert int to string, long to string, boolean to string, character to string, 
	float to string, double to string, object to string and char array to string.  */
	
	public static void main(String[] args) {
		
		int a=20;
		String s=String.valueOf(a);
		
		System.out.println("concatinatuon :="+ s+10);
		
		
		double b=20.4;
		String  S1=String.valueOf(b);
          System.out.println("concat := "+S1+20);		
          
          
       boolean g=true;
       
       String sbol=String.valueOf(g);
       System.out.println("con:= "+sbol+10);
       
 	}

	
}
