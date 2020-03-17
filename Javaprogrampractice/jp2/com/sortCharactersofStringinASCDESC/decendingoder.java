package com.sortCharactersofStringinASCDESC;

public class decendingoder {

	
	public static void main(String[] args) {
		
	/*input=	alkasingh
	 * 
	 * Output : snlkihgaa 
	 * 
	 */
		String input="alkasingh";
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
		
		for(int i=inputarr.length-1;i>=0;i--){
			System.out.print("" +inputarr[i]);
		}
		
		
		
	}
		
	
}
