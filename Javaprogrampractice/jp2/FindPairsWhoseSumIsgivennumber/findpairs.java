package FindPairsWhoseSumIsgivennumber;

import java.util.Arrays;

public class findpairs {

	public static void main(String[] args) {
		
		int inputArray[]=new int[]{2,5,6,3,4,1,7};
		int inputNumber=10;
		
		System.out.println("Input Array : "+Arrays.toString(inputArray));
        
        System.out.println("Input Number : "+inputNumber);
         
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
  
        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                }
            }
        }
         
       
		
		
		
	}
	
	
	
	
}
