package QuizsProrams;

import java.util.HashMap;

public class Hashmapquiz {

	
	
	public static void main(String[] args) {
		
		//has
		
		HashMap<String,Integer> hs=new HashMap<String,Integer>();
		
		hs.put(null, 1);
		hs.put(null, 2);
		System.out.println(hs.get(null));///return 2 becuase ovvride key and value and null is allowed
		
		
		
	}
}
