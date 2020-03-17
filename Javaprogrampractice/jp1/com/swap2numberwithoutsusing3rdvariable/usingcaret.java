package com.swap2numberwithoutsusing3rdvariable;

public class usingcaret {

	
	public static void main(String[] args) {
		int a =5,b=3;
		// ^ bitwise xor in java
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a is := "+  a +"and b is =" +b );
	}
	
	
}
