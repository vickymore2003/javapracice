package CountAllPalindromeSubStringsinaString;

public class PalidromesofStrings {

	
	public static void main(String[] args) {
		/*
		Input : str = "abaab"
				Output: 3
				Explanation : 
				All palindrome substring are :
				 "aba" , "aa" , "baab" 
		
		*/
		
		String input="aaba";
		String substrings[]=new String[30];
		String reverseArray[]=new String[substrings.length];;
		System.out.println("main string:= "+input);
        int k=0;
		for(int i=0;i<input.length();i++){
			for(int j=i+1;j<=input.length();j++){
				
				String substring=input.substring(i, j);
				substrings[k]=substring;
				k++;
			}
			
		}
		
	//	System.out.println("substringare"+Arrays.toString(substrings));
		
		for(int i=0;i<substrings.length;i++){
			if(substrings[i]!=null){
			StringBuffer sb=new StringBuffer(substrings[i]);
			sb=sb.reverse();
			reverseArray[i]=sb.toString();
			}
		}
		String Palindromarray[]=new String[reverseArray.length];
		for(int i=0;i<reverseArray.length;i++){
			
			for(int j=0;j<substrings.length;j++){
				
				if(substrings[j]!=null && reverseArray[i]!=null){
					if(substrings[j].equalsIgnoreCase(reverseArray[i])  && reverseArray[i].length()>1){
						Palindromarray[i]=reverseArray[i];
						break;
					}	
			}
		   }
		}
		//System.out.println("reverse are "+Arrays.toString(reverseArray));
		//System.out.println("Palindromes are "+Arrays.toString(Palindromarray));
		System.out.println("Palindromes are ");
		for(int i=0;i<Palindromarray.length;i++){
			if(Palindromarray[i]!=null){
			System.out.print( " "+Palindromarray[i]);
			}
		}
	}
	
	
	
}
