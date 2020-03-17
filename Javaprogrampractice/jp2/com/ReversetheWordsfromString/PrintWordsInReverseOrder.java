package com.ReversetheWordsfromString;

public class PrintWordsInReverseOrder {

	
	public static void main(String[] args) {
		
		String	Input= "I AM A GEEK",newstring="";
		
		//ouput=GEEK A AM I
		
		   String words[]=Input.split(" ");
		    
		   for (int i=words.length-1;i>=0;i--){
			   
			   
			   newstring=newstring+words[i]+" ";
			   
		   }
		   
		   System.out.println("words in reverse order:= "+newstring);
	}
	
}
