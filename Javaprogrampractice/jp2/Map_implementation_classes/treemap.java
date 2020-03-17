package Map_implementation_classes;

import java.util.Map;
import java.util.TreeMap;

public class treemap {
/*
	
	It cannot have null key but can have multiple null values.
	It is same as HashMap instead maintains ascending order.
	*/
	
	
	public static void main(String[] args) {
		
		
		 TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul"); 
		  hm.put(205, null);//null is allowed as values
		  //hm.put(null, "s"); not alllowed as key
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		
		
	}
}
