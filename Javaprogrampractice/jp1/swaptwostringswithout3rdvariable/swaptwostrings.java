package swaptwostringswithout3rdvariable;

public class swaptwostrings {

	
	public static void main(String[] args) {
		
		String a="sachin";
		String b="funde";
		
		
		a=a+b;
		
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length(), a.length());
		/// correct also
		//  a=a=a.substring(b.length());
		System.out.println("new a:= "+a  + "new b:=  "+b);
		
	}
}
