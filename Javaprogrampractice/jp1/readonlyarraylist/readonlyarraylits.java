package readonlyarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class readonlyarraylits {

	
	public static void main(String[] args) {
		
		
		List<String> li=new ArrayList<String>();
		   
		   li.add("sachin");
		   li.add("ashikali");
		   li.add("maner");
		   li.add("ashikali");
		   System.out.println("before"+li.toString());
		   
		   List<String> liunm=   Collections.unmodifiableList(li);
		   liunm.add("s");
		   
		   
		   
		   
		   
	}
}
