package Map_implementation_classes;

import java.util.Hashtable;
import java.util.Map;

public class hashtable {
/*
	A Hashtable is an array of list. Each list is known as a bucket. The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
	It contains only unique elements.
	It may have not have any null key or value.
	It is synchronized.
	
	*/
	
	public static void main(String args[]){  
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  
		  hm.keys();
		  hm.keySet();
		  hm.values();
		 
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	
	
}}
