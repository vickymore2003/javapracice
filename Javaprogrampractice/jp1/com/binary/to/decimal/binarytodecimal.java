package com.binary.to.decimal;

public class binarytodecimal {

	public static void main(String[] args) {
		
		int binarynumber=1110,decimalnumber=0,power=0;
		
		
		while(binarynumber>0){
			int remainder=binarynumber%10;
			decimalnumber=(int) (decimalnumber+remainder*Math.pow(2, power));
			binarynumber=binarynumber/10;
			power++;
		}
		System.out.println("decimal number is ="+decimalnumber);
		
		
		
		
		
	}
}
