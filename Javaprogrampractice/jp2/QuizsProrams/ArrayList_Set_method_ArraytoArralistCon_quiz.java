package QuizsProrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Set_method_ArraytoArralistCon_quiz {

	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(2);
		a.add(3);
		a.add(1,5);
		a.set(0, 4);//is used to set values at specified index
	   
		
		
	   System.out.println(a.get(1));
	   
	   List<Integer> list = new ArrayList<Integer>();   
       
       Integer[] arr = {2,10,3};
       
       list = Arrays.asList(arr);
    		   
	   List<Integer> arrtype=new ArrayList<Integer>();
	   
		Integer[] arr1=new Integer[]{2,4,5};
		
		arrtype=Arrays.asList(arr1);/// it return fixed size of list so it can't grow  and it has return list<T>
		arrtype.add(3);
		//List<T>   :: what is t 
		
	 // Queue<E>    ///what is e 
		//Sachin Funde
		
		
		
		
		
		
	  
	   
	}
}
