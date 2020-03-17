package QuizsProrams;

import java.util.HashSet;
import java.util.Set;

public class SetaddDifferentElements {

	
	
	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		
		
		s.add("s");
		s.add("S");//will get add
		System.out.println(s.toString());
		
	}
}
