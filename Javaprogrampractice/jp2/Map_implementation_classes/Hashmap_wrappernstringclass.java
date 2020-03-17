package Map_implementation_classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap_wrappernstringclass {

	public static void main(String[] args) {
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  
		  Set<Map.Entry<Integer,String>> entryset=hm.entrySet();
		  
		  System.out.println("using entryset with set");
		  
		  for(Map.Entry<Integer,String> e:entryset){
			  System.out.println(e.getKey() +" "+ e.getValue());
		  }
		  
		  System.out.println("using entryset with map");
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	}
	
	
	
}
