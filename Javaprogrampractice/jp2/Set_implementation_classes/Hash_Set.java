package Set_implementation_classes;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
/*
	Now as you can see that whenever we create a HashSet, it internally creates a HashMap and
	if we insert an element into this HashSet using add() method, it actually call put() method 
	on internally created HashMap object with element you have specified as it’s key and constant 
	Object called “PRESENT” as it’s value. So we can say that a Set achieves uniqueness internally through HashMap. 
	Now the whole story comes around how a HashMap and put() method internally works.
	
	we can str
	
	*/
	public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		  HashSet<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		  set.add(null);// allows one null
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
}

}