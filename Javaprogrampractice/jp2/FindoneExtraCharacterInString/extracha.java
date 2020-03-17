package FindoneExtraCharacterInString;

import java.util.Arrays;

import java.util.List;

public class extracha {

	public static void main(String[] args) {
		
		 String strA = "abcd";
	     String strB = "cbdae";
		
	     String Greater_str=strA.length()> strB.length()?strA:strB;
	     for(int i=0;i<Greater_str.length();i++){
	    	 char ch=Greater_str.charAt(i);
	    	 String ch_=String.valueOf(ch);
	    	 if(!(strA.contains(ch_))){
	    		 
	    		 System.out.println("missing charcter "+ ch_);
	    	 }
	    	 
	     }  
	     
		
		
		int a[]=new int[]{1,2,3};
		
		List<int[]> aa=	Arrays.asList(a);
		
		int [] k=aa.get(0);
		System.out.println(k[2]); 
		
	     
	}
	
	
}
