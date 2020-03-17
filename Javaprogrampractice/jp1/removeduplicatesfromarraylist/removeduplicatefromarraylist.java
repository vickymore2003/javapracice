package removeduplicatesfromarraylist;

import java.util.*;

public class removeduplicatefromarraylist {

	
	
	public static void main(String[] args) {
	
	   List<String> li=new ArrayList<String>();
	   
	   li.add("sachin");
	   li.add("ashikali");
	   li.add("maner");
	   li.add("ashikali");
	   System.out.println("before"+li.toString());
	   
	    Collections.sort(li);
	    System.out.println("asc"+li.toString());
	    //code to to print arraylist in descending order
	    for(int i=li.size()-1;i>=0;i--){
	    	System.out.println("ele"+li.get(i));
	    }
	    
	  // Set<String> s=new HashSet<String>(li);
	   Set<String> s=new LinkedHashSet<String>(li);
   
	   System.out.println("after"+s.toString());
	
	}
}
