package RerversArrayWithoutUsingAnotherArrya;

import java.util.Arrays;

public class usingforloop {

	public static void main(String[] args) {
		
		int []a=new int[]{1,2,3,4};
		int mid=a.length/2;
		
		if(mid%2==0){
			mid=mid;
		}else{
			mid=mid+1;
		}
		
		for(int i=0,k=a.length-1;i<mid;i++,k--)
		{
			int temp=a[i];
			a[i]=a[k];
			a[k]=temp;
		}
		
		System.out.println("reverse ararys"+Arrays.toString(a));
	
	}
	
	
}
