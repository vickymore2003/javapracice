package reversestringwithrecursion;

public class ReverseStringWithRecursion {
	String reverse="";
	public String reverseString(String str){
		//System.out.println(str.substring(str.length()-1));
		//System.out.println(reverse);
		if(str.length()==1){
			return str;
		}
		else{
			System.out.println("revr"+reverse);
			 reverse= reverse + str.substring(str.length()-1) + reverseString(str.substring(0, str.length()-1));
		     return reverse;
		}
	}
	
	
	public static void main(String[] args) {
		ReverseStringWithRecursion r=new ReverseStringWithRecursion();
		String rev=r.reverseString("sachin");
		System.out.println(rev);
	}
	
}
