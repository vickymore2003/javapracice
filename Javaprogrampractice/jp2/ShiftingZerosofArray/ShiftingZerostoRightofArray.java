package ShiftingZerosofArray;

import java.util.Arrays;

public class ShiftingZerostoRightofArray {

	public static void main(String[] args) {
		
		
		int  arr[]=new int[]{12, 0, 7, 0, 8, 0, 3};
				
				//[12, 7, 8, 3, 0, 0, 0]
		
		for(int i=0;i<arr.length-1;i++){
			
			for(int j=0;j<arr.length-1;j++){
				
				if(arr[j]==0){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
				System.out.println("shifting"+Arrays.toString(arr));
			}
			
		}
		System.out.println("array after shifting"+Arrays.toString(arr));
		
		/*
		Set<Integer> set=new HashSet<>();
		set.add(2);
		set.add(3);
	
		Integer arr1[]=new Integer[set.size()];
		arr1= set.toArray(arr1);
		*/
	}
	
	
}
