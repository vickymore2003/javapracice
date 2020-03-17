package CountOccurancesOfEachEelmentInArray;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

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
		
		  Set<Entry<Integer,Integer>>entires  =map.entrySet();
	       System.out.println("number :=+ values ");
	       for(Entry<Integer, Integer> ent:entires){
	            System.out.println(ent.getKey()+" ==> "+ent.getValue());
	        }
		
	}
	
	
}
