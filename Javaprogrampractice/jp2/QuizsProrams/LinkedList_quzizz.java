package QuizsProrams;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_quzizz {

	
	public static void main(String[] args) {
		
		
		 List<String> ll = new LinkedList<String>();
		 
	        ll.add("C");  //   c
	        
	        ((LinkedList<String>) ll).push("B");    //  b  c  
	        ((LinkedList<String>) ll).addFirst("A");   // a b c
	        ((LinkedList<String>) ll).offer("D");   // a b c d
	 
	       // System.out.print((LinkedList<String>)ll.remove() + " ");
	 
	        System.out.print(((LinkedList<String>) ll).poll());
	}
}
