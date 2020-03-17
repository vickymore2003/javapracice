package reversenumber;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number=119;
		int reversenumber = 0;
		while(number!=0)
		{
			reversenumber= reversenumber*10+number%10;
			number=number/10;
		}
		System.out.println("reverse number "+reversenumber);
	}
	
	
}
