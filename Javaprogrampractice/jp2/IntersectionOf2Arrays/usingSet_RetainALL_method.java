package IntersectionOf2Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class usingSet_RetainALL_method {

	public static void main(String[] args) {
		
		
		
		String[] inputArray1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		  
        String[] inputArray2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        
		
        Set<String> hashset1=new HashSet<String>(Arrays.asList(inputArray1));
		Set<String> hashset2=new HashSet<String>(Arrays.asList(inputArray2));
		
		boolean status=hashset1.retainAll(hashset2);
		
		System.out.println("status is :="+status);
		
		System.out.println("1st arrays"+inputArray1.toString());
		System.out.println("1st arrays"+inputArray2.toString());
		
		System.out.println("1st arrays"+Arrays.toString(inputArray1));
		System.out.println("1st arrays"+Arrays.toString(inputArray2));
		
		System.out.println("after intersection common elements are:="+ hashset1.toString());
		
		
		
	}
	
	
}
