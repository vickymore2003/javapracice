package findingMostFrequentElementFromArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class usinghashmap {

	public static void main(String[] args) {
		

		Integer a[]=new Integer[]{2,4,6,7,2,3,4,5,7,7,8};
		
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		
		
		for(Integer number:a){
			
			if(map.containsKey(number)){
				map.put(number, (map.get(number)+1));
			}else{
				map.put(number, 1);	
			}
		}
		
		
		ArrayList<Integer> arylist=new ArrayList<Integer>();
		
		  Set<Entry<Integer,Integer>>entires  =map.entrySet();
	       System.out.println("number :=+ values ");
	       for(Entry<Integer, Integer> ent:entires){
	            System.out.println(ent.getKey()+" ==> "+ent.getValue());
	            arylist.add(ent.getValue());
	        }
		
		
	      
		   
		   
		   Collections.sort(arylist);
		  
		  int max_number=arylist.get(arylist.size()-1);
		 
		  Set<Entry<Integer,Integer>>entires_  =map.entrySet();
	       System.out.println("number :=+ values ");
	       for(Entry<Integer, Integer> ent:entires_){
	    	   if(ent.getValue()==max_number){
	            System.out.println("max frequent number:= "+ent.getKey()+" ==> "+ent.getValue());
	    	   }
	            
	        }
		   
		   
		   
			
	       
	       
	       
		
		
	}
	
	
}
