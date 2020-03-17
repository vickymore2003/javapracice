package MissingCharactrstomakestringPAnagram;

public class missingchaforpangram {

	
	
	public static void main(String[] args) {
		
		
		
		String Input= "welcome to geeksforgeeks";
		//Output : abdhijnpquvxyz
		
		String alphabets="abcdefghijklmnopqrstuvwxyz";
		
		String missingchar="";
		for(int i=0;i<alphabets.length();i++){
			
			String ch=String.valueOf(alphabets.charAt(i));
			for(int j=0;j<Input.length();j++){
				
				if(!(Input.contains(ch))){
					missingchar=missingchar+ch;
					
					break;
					
				}
				
				
				
			}
			
				
		}
		
		System.out.print(" " +missingchar);
	
	}
}
