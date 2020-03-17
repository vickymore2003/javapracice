package ArrayToArraylistConversionNViceVersa;

import java.util.ArrayList;

public class ArrayListToArray {

	
	
	public static void main(String[] args) {
		
	ArrayList<Integer> arr=new ArrayList<Integer>();	
		
	arr.add(2);
	arr.add(4);
	Integer a[]=new Integer[arr.size()];
	
	arr.toArray(a);
	 
	for(Integer i:a){
		System.out.println(i);
		
	}
		
	}
	
	
	
	
	
}
