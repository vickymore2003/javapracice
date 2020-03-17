package RoundNumbertonearestMultipleof10;

public class rounding {

	
	public static void main(String[] args) {
		
		int number=43;
		
		int a=(number/10)*10;
		int b=a+10;
		
		int nearestnumber=number-a > b-number ?b:a;
		System.out.println("nearest number is := "+nearestnumber);
	
		
	}
	
	
	
	
}
