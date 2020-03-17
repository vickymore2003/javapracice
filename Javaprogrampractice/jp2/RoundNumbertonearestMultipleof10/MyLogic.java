package RoundNumbertonearestMultipleof10;

public class MyLogic {
	
	
	public static void main(String[] args) {
		
		int number=125;
		
		int lastdigit=number%10;
		
		int difference=10-lastdigit;
		
		int nextnearest=number+difference;
		
		int previousnearest=number-lastdigit;
		
		if(difference<5){
			
			System.out.println("nearest number is "+nextnearest);
		}else{
			
			System.out.println("nearest number is "+previousnearest);
		}
		
		
		
		
		
	}

}
