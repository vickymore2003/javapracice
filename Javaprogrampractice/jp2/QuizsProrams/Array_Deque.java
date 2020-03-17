package QuizsProrams;

import java.util.ArrayDeque;

public class Array_Deque {

	public static void main(String[] args) {
       
		ArrayDeque<String> adq = new ArrayDeque<String>();
        
	
		
        adq.add("A");   //  add element from back 
        adq.push("B");  //      b  a// add element from front
        adq.addFirst("C");// c b a   //front 
        adq.offer("D");//  c b a d// add element from back
        
        for(String s :adq){
        	
        	System.out.println(s);
        }
        System.out.print(adq.peek() + " " + adq.pop() + " " + adq.poll());
		
     for(String s :adq){
        	
        	System.out.println(s);
        }
		
	}
	
	
}
