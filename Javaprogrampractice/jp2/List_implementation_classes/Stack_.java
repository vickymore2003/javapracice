package List_implementation_classes;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Stack_ {

	
	
	public static void main(String[] args) {
		
		Stack<String> s=new Stack<String>();
		
		s.push("a");//push(object o)
		s.push("ff");
		s.push("c");
		s.add("d");
		Iterator itr=s.iterator();
	
		
	while(itr.hasNext()){
		
		System.out.println(itr.next());
		
	}
	
	
	System.out.println("Peek "+s.peek().toString());
	
	String o=s.pop();//object pop();
	System.out.println("pop"+o);
	
	for(String s1:s){
		
		System.out.println("string "+s1);
	}
	
	for(int i=0;i<s.size();i++){
		System.out.println("get"+s.get(i));
		
	}
	
	Enumeration e=s.elements();
	
	while(e.hasMoreElements()){
		
		System.out.println("v"+e.nextElement());
	}
	
	Iterator itr1=s.iterator();
	
	
	while(itr1.hasNext()){
		
		System.out.println(itr1.next());
		
	}
	if(s.empty()){
	int i=s.search("c");
	
		System.out.println("search c"+i);//-1 for not found .
		
		int i1=s.search("a");
		
		System.out.println("search b"+i1); //return postion from top element ..for top is 1
	}
	
	Collections.sort(s);
	System.out.println(s.toString());
	}
}
