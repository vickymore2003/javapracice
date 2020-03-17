package com.sumofdigitsofnumber;

public class sumofdigitsofnumber {

	
	
	public static void main(String[] args) {
		
		int number =234,total=0;
		while(number >0){
			
			int remainder =number %10;
			 total =total +remainder;
			number =number /10;
			
		}
		
		System.out.println("sum of digits is = "+total);
	}
	
}
