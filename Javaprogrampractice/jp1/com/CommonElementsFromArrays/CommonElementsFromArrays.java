package com.CommonElementsFromArrays;

public class CommonElementsFromArrays {

	//implememntation is pending 
	public static void main(String[] args) {
	int commonelementarray[]=new int[10];
	int arr1[]={2,4,5,7,8};	
	int arr2[]={3,2,4,5,8};
	
	for(int i=0;i<arr1.length;i++){
		
		for(int j=0;j<arr2.length;j++){
			
			if(arr1[i]==arr2[j]){	
				commonelementarray[i]=arr1[i];
			}
			
		}
		
	}
	
	for(int i=0;i<commonelementarray.length;i++){
		System.out.print(" "+commonelementarray[i]);
		
		
	}
	
		
   
	}
	
	
}
