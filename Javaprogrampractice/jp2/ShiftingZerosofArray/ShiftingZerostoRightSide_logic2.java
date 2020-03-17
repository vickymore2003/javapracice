package ShiftingZerosofArray;

import java.util.Arrays;

public class ShiftingZerostoRightSide_logic2 {

	
	
	public static void main(String[] args) {
		
		
		int inputArray[]=new int[]{4,8,0,7,5,0,6,8};
		System.out.println("Input Array : "+Arrays.toString(inputArray));
        
        //Initializing counter to 0
  
        int counter = 0;
  
        //Traversing inputArray from left to right
  
        for (int i = 0; i < inputArray.length; i++)
        {
            //If inputArray[i] is non-zero
  
            if(inputArray[i] != 0)
            {
                //Assigning inputArray[i] to inputArray[counter]
  
                inputArray[counter] = inputArray[i];
  
                //Incrementing the counter by 1
  
                counter++;
            }
        }
  
        //Assigning zero to remaining elements
  
        while (counter < inputArray.length)
        {
            inputArray[counter] = 0;
  
            counter++;
        }
  
        System.out.println("Input Array After moving zeros to end :");
         
        System.out.println(Arrays.toString(inputArray));
		
	}
}
