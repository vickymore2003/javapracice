package reapeatedCharactersinstrings;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class repeatedcharactersstring {

	
	public static void main(String[] args) {
		
		
		//using set approach 
		
        Set<String> set=new TreeSet<String>();
        
        String a="sachinfunde";        
        //char[] data=a.toCharArray();
        for(int i=0;i<a.length()-1;i++)
        {
             for(int j=i+1;j<a.length();j++)
             {
                   if((a.charAt(i)==a.charAt(j)))
                              {
                        
                        set.add(Character.toString(a.charAt(i)));
                              }
             }
        }
        
        
        Iterator<String> r=set.iterator();
        System.out.println("Repeated characters in String are");
        while(r.hasNext())
        {
             System.out.print(r.next()+" ");
        }
        
	
	}
}
