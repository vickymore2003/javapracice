package FindDublicatesElementsFromArray;

import java.util.HashSet;
import java.util.Set;

public class dublicateselements {

	
	
	public static void main(String[] args) {
		
		String [] arr=new String[]{"a","b","c","a","c"};
		
		Set<String> hashset=new HashSet<String>();
		
		 for(String abc:arr){
			 if(hashset.add(abc)==false){
			 System.out.println("dublicates aree:" +abc);
			 
			 }
		 }
		
		
	}
}
