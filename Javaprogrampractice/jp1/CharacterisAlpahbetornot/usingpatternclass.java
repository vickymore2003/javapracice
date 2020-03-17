package CharacterisAlpahbetornot;

import java.util.regex.Pattern;

public class usingpatternclass {

	public static void main(String[] args) {
		
		char c='c';
		String ch=Character.toString(c);
		if(Pattern.matches("[a-zA-Z]", ch)){
			
			System.out.println(ch+" is a character");
		}else{
			
			System.out.println(ch+" not a character");
		}
		
	}
	
	
}
