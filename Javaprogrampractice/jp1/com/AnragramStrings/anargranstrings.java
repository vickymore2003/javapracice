package com.AnragramStrings;

public class anargranstrings {

	
	public static void main(String[] args) {
		String a="EEEE";
		String b="EEEE";
		int matchflag = 0,matchflag2=0;
		int count=0;
		
		for(int i=0;i<a.length();i++)
		{
			matchflag=0;
			matchflag2=0;
			for(int j=0;j<b.length();j++)
			{
				if(a.charAt(i)==b.charAt(j))
				{
					matchflag=1;
				}
				
			}
			for(int j=0;j<b.length();j++)
			{
				if(b.charAt(i)==a.charAt(j))
				{
					matchflag2=1;
				}
				
			}
			
			if(matchflag==0 || matchflag2==0){
				System.out.println("Both Strings are not anagrams of each other");
				break;
			}
		}
		if(matchflag==1 && matchflag2==1)
		{
			System.out.println("Both Strings are anagrams of each other");
		}
		}
}
