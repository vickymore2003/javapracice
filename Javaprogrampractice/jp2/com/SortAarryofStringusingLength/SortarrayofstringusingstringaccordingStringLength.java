package com.SortAarryofStringusingLength;

import java.util.Arrays;

public class SortarrayofstringusingstringaccordingStringLength {


	/*
	Input : {"GeeksforGeeeks", "I", "from", "am"}
	Output : I am from GeeksforGeeks

	Input :  {"You", "are", "beautiful", "looking"}
	Output : You are looking beautiful
	*/
	
	public static void main(String[] args) {
		
		String Input="GeeksforGeeeks, I, from, am";
		
		String InputArray[]=Input.split(",");
		int Temp[]=new int[InputArray.length];
		String Output[]=new String[InputArray.length];
		
		for(int i=0;i<InputArray.length;i++){
			Temp[i]=InputArray[i].length();
		}
		
		Arrays.sort(Temp);
		
		for(int i=0;i<InputArray.length;i++){
			
			for(int j=0;j<InputArray.length;j++){
				if(InputArray[j].length()==Temp[i]){
				Output[i]=InputArray[j];
				break;
				}
			}
		}
		
		for(int i=0;i<Output.length;i++){
			System.out.println(" "+Output[i]);
			
			
		}
			
		
	}
	
	
	
	
	
}
