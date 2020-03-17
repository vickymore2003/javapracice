package NumberofLargerElementsonrightSideofString;

public class NumberofLargerElementsOnrightsideofstring {

	
	 public static void main(String[] args) {
		
		 String str="geeks";
		 
		 char str_arr[]=str.toCharArray();
		 
		 
		 for(int i=0;i<str_arr.length;i++){
			 
			 int temp=str_arr[i],count=0;
			 for(int j=1;j<str_arr.length;j++)
			 {
			     int nextelement=str_arr[j];
				 
				 if(nextelement >temp){
					 
					 count++;
				 } 
				 
			 }
			 System.out.print(" "+count);
			 
		 } 
		  
	}
	
}
