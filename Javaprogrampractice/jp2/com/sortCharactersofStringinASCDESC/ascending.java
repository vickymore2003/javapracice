package com.sortCharactersofStringinASCDESC;

public class ascending {

	
	public static void main(String[] args) {
		/*
		Input : bbccdefbbaa 
		Output : aabbbbccdef
				aabbbbccdef
		Input : geeksforgeeks
		Output : eeeefggkkorss
		*/
		
		//will use the bubble sort.
		
		
		
		String input="bbccdefbbaa";
		System.out.println("e"+input.compareTo("abc"));
		
		
		char inputarr[]=input.toCharArray();
		
		for(int i=0;i<input.length()-1;i++){
			
			for(int j=i+1;j<input.length();j++){
				
				int first=inputarr[i];
				int second=inputarr[j];
				
				
				if(first>second){
				 char temp=inputarr[i];
				 inputarr[i]=inputarr[j];
				 inputarr[j]=temp;
					
				}
				
			}
			
			
		}
		
		for(int i=0;i<inputarr.length;i++){
			System.out.print("" +inputarr[i]);
		}
		
		
		
	}
	
	
	
}
