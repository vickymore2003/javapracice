package EqualityOf2Arrays;

import java.util.Arrays;

public class Equalityofarrays {

	
	public static void main(String[] args) {
		
		int arr1[]=new int[]{1,2,2,3,5};
		int arr2[]=new int[]{2,2,3,5,1};
		int presentflag=0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(arr1.length==arr2.length){
		for(int i=0;i<arr1.length;i++){
			presentflag=0;
			for(int j=0;j<arr2.length;j++){
				
			 	if(arr1[i]==arr2[j]){
			 		presentflag=1;
			 		break;
			 	}
				
			}	
			if(presentflag==0){
				System.out.println("arrays are not equal");
				break;
			}
		}
		if(presentflag==1){
			System.out.println("arrays are  equals");
		}
		
		}else{
			
			System.out.println("arrays are not equal");
			
		}
			
		
		
	}
}
