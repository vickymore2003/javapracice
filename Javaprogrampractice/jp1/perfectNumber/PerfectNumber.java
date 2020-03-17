package perfectNumber;

import java.util.ArrayList;

public class PerfectNumber {

	public static void main(String[] args) {
		
		// divisor addition equals to number: 6
		// 6/1,6/2,6/3:=1+2+3=6
		
		int number =28,sum=0;
		ArrayList<Integer> divisorlist= new ArrayList<Integer>();
		
		for(int i=1;i<number;i++){
            
			 if(number%i==0){
				 divisorlist.add(i);
			 }
			
		}
		
		for(Integer i:divisorlist){
			sum=sum+i;	
		}
		if(number==sum){
			System.out.println(number +" is perfect number");
			
		}else{
			
			System.out.println(number +" is not a perfect number");
		}
		
		
	}	
		
	
	
}
