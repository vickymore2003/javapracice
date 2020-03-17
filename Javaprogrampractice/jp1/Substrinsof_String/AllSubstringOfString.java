package Substrinsof_String;

public class AllSubstringOfString {

	public static void main(String[] args) {
		
		String str="sachin";
		
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				
				System.out.println("substring is := "+str.substring(i, j));	
			}
			
			
		}
	
		
	}
	
	
	
}
