package QuizsProrams;

public class StringConstatntPool {

	public static void main(String[] args) {
		
		String a="abc";
		String b="abc";
		
		System.out.println(a.equals(b));
		System.out.println(a==b);
		System.out.println(a.hashCode());
	    System.out.println(b.hashCode());
		
	    String ab="sachin";
	    System.out.println("ab"+ab.hashCode());
	    String abc=ab.concat("funde");
	    System.out.println("abc"+abc.hashCode());
	   
	    
	    String bc="sachinfunde";
	    System.out.println("bc "+bc.hashCode());
	    System.out.println(bc==abc);
	    System.out.println(abc.equals(bc));
	    
	    
		
	}
	
}

