package primenumber;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number=11, middlenumber=0,flag=0;
		
		middlenumber=number/2;
		
		if(number==0 || number==1){
			
			System.out.println(number+ "is not prime number");
			
		}else{
			
			for(int i=2;i<=middlenumber;i++){
				
				if(number%i==0){
					System.out.println(number + "is not prime number");
					flag=1;
					break;
				}
				
			}
			if(flag==0){
				System.out.println(number+" is prime number");
			}
			
			
		}
		
		
	}
	
	
}
