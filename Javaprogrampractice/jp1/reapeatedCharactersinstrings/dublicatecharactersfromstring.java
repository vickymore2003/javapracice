package reapeatedCharactersinstrings;

import java.util.HashMap;

public class dublicatecharactersfromstring {

	public static void main(String[] args) {
		
		// using the hashmap.
		String str="sachin funde walunj";
		
		HashMap<Character, Integer>  charactershashmap=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++){

			 Character ch=str.charAt(i);
			 
			 if(charactershashmap.containsKey(ch)){
				 charactershashmap.put(ch, charactershashmap.get(ch)+1);		 
				 
			 }else{
				 charactershashmap.put(ch,1);
		
			 }
		}
		
		for(Character ch:charactershashmap.keySet()){
			
			if(charactershashmap.get(ch)> 1){
				
				System.out.println("dublicate character and its count is := " + ch  + ":= "+ charactershashmap.get(ch));
				
			}
			
			
		}
		
		
		
		
		
		
		
	}
	
	
}
