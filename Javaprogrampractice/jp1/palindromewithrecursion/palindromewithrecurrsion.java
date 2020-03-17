package palindromewithrecursion;

public class palindromewithrecurrsion {

	//first we reverse  the string using recursion and then just compare it with reverse string .
	
	
	public String reverse(String s){
		String reverse="";
		if(s.length()>0){
			reverse=s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
		}
		return reverse;
	}
	
	
	public static void main(String[] args) {
		palindromewithrecurrsion p= new palindromewithrecurrsion();
		
		String s="shital";
	
		String reverse =p.reverse(s);
		
		if(s.equalsIgnoreCase(reverse)){
			System.out.println(s +" is a palindrome string");
		}else{
			System.out.println(s + " is not palindrome ");
		}
		
		
	}
	
	
	
}
