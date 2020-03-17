package SumofAllNumberINString;

public class SumofAllNumbersInString {
	

	
	public static void main(String[] args) {
		 String Input="12ashik33334",temp="";
		 int sum=0;
		 
		 
		 char ch[]=Input.toCharArray();
		 
		for(char cha_r:ch){
			
			if(Character.isDigit(cha_r)){
				
				temp+=cha_r;
		 		
			}else{
				
				if(!(temp.isEmpty())){
					sum=sum+Integer.valueOf(temp);
				}
				temp="";
			}
			
			
		 }
		sum=sum+Integer.valueOf(temp);	 
		 
		System.out.println("sum is :="+sum);
		
	   }
		
	}
	
	
	

