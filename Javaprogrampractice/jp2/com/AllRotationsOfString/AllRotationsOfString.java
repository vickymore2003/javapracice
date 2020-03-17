package com.AllRotationsOfString;

public class AllRotationsOfString {

	
	public static void main(String[] args) {
		
		
	/*	Input : S = "geeks"
				Output : geeks
				         eeksg
				         eksge
				         ksgee
				         sgeek
		
		*/
		
		String input="geeks";
		char[] inputarr=input.toCharArray();
		int rotationbynumber=2;
		
		
		
			
			for(int i=0;i<inputarr.length;i++)
			{
				char temp=inputarr[0];
				int j=0;
				for(j=0;j<inputarr.length-1;j++){
					char temp2=inputarr[j+1];
					inputarr[j]=temp2;
				}
				inputarr[j]=temp;
				System.out.println("rotated string is :="+ String.valueOf(inputarr));
				
				//check no of rotatiosn required to get same string
				if(input.equalsIgnoreCase(String.valueOf(inputarr))){
				
				System.out.println("no of rotations required to get same string is :=" + (i+1));
			}
			
		   }
			
		
		
		
	
	}
	
	
}
