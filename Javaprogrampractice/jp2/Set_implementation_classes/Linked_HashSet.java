package Set_implementation_classes;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HashSet {

	//maintains the insertions order 
	// internal data structur = linkedlist + hash table
	
	//linkedhashset extends hashset and hashset extends abstractSet class and this class implements set interface
	
	public static void main(String args[]){  
		  LinkedHashSet<String> al=new LinkedHashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  al.add(null);
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  

	
  }
}