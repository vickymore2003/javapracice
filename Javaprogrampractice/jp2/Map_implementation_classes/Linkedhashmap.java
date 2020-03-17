package Map_implementation_classes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {

	
	
	//maintains insertion order other is same as hashmap as it inherits the hashmap.
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  
		for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	}
	 
}
