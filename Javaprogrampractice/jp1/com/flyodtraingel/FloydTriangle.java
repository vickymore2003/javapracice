package com.flyodtraingel;

public class FloydTriangle {

	static int trianglelength=5;
	
	public static void main(String[] args) {
		int counter=1;
		for(int i=1;i<=trianglelength;i++){
			
			for(int j=1;j<=i;j++){
				
				System.out.print(counter +" ");
				counter++;
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
}
