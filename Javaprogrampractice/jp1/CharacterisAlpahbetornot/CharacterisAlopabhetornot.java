package CharacterisAlpahbetornot;

public class CharacterisAlopabhetornot {

	
	public static void main(String[] args) {
		
		char ch ='s';
		
		
		String chr=Character.toString(ch);
		if(chr.matches("[a-zA-Z]")){
			System.out.println(chr +" is an character ");
			
		}else{
			System.out.println(chr +" is an not character");
			
		}
		
		
	}
	
	
}
