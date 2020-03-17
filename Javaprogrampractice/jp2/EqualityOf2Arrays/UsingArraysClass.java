package EqualityOf2Arrays;

import java.util.Arrays;

public class UsingArraysClass {

	public static void main(String[] args) {
		
		
		int arr1[]=new int[]{1,2,2,3,5};
		int arr2[]=new int[]{2,2,3,5,1};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean status=Arrays.equals(arr1,arr2);
		
		
		if(status){
			
			System.out.println("arrays are equal");
		}else{
			
			System.out.println("arrays are not equal");
		}
		
		
		
	}
	
	
}
