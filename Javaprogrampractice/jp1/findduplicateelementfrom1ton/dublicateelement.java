package findduplicateelementfrom1ton;

import java.util.Arrays;

public class dublicateelement {
  
	public static void main(String[] args) {
		int numbers[]= new int[]{1,2,3,4,5,6,7,7,8,9,10};
		//numbers from 1 to 5 range
		
		Arrays.sort(numbers);
		int rangefirstnum=numbers[0];
		int rangelastnum=numbers[numbers.length-1];
		
		int addition=0;
		
		for(int i=rangefirstnum;i<=rangelastnum;i++){
			
			addition=addition+i;
		}
		System.out.println("addtion"+addition);
		int arraysum=0;
		for(int i=0;i<numbers.length;i++){
			
			arraysum=arraysum+numbers[i];
		}
		System.out.println("arryasum"+arraysum);
		
		int	dublicatenumber=arraysum-addition;
		System.out.println("dublicatenumb"+dublicatenumber);
		
	}
	
	
}
