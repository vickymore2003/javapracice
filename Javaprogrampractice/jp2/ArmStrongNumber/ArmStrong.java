package ArmStrongNumber;

public class ArmStrong {

	
	public static void main(String[] args) {
		
		int number =153,NumberofDigits=0,addition=0,num=153,copy=0;
		
		
		while(number>0){
			number =number/10;
			NumberofDigits++;
		}
		
		System.out.println("no of digits is =" +NumberofDigits);
		copy=num;
		while(num >0){
			int remainder=num%10;
			addition=(int) (addition+Math.pow(remainder, NumberofDigits));
			num=num/10;
		}
		
		System.out.println("addition is :=" +addition);
	    if(copy==addition){
	    	System.out.println(copy+":= number is armstrong");
	    	
	    }else{
	    	System.out.println(copy+":= number is not armstrong");
	    	
	    }
		
		
		
	}
	
	
}
