package com.decimal.to.binary;

public class decimalToBinary {

	
	public static void main(String[] args) {
		int num=10;
		String binarnumber="";
		
		
		while(num>0){
			
			int remainder=num%2;
			binarnumber=remainder+binarnumber;
			num=num/2;
		}
		
		System.out.println("binary number is := " +binarnumber);
		
		
		
	}
	
	
}
