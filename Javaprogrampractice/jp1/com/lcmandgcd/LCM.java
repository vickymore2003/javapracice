package com.lcmandgcd;

public class LCM {

	public static void main(String[] args) {
		
		//LCM - Least common multiple
		
		
		int a=4,b=6,lcm=0;
	    
	    lcm=a>b?a:b;
	    
	    while(true){
	    	
	    	if(lcm%a==0 && lcm%b==0){
	    		break;
	    	}
	    	lcm++;
	    }
		
		System.out.println("LCM is = "+lcm);
		
	}
	
	
}
