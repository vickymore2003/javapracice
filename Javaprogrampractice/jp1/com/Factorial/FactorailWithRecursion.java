package com.Factorial;

public class FactorailWithRecursion {
int factorial=1;
	
	public int factorial(int number){
		
		
		if(number >0){
		
		 factorial=number * factorial(number-1);
		
		}
		
		return factorial;
	}
	

	public static void main(String[] args) {
		FactorailWithRecursion f=new FactorailWithRecursion();
		System.out.println("factorial is := " +f.factorial(4));
		
	}
	
	
	
	
	
	
	
	
}
