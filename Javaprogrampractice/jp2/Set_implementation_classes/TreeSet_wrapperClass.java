package Set_implementation_classes;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_wrapperClass {

	
	public static void main(String args[]){  
		  //Creating and adding elements  
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		 // al.add(null);  tree set doesnt allowed null value
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

	
}