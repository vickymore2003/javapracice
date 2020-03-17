package sortarraybubble;

public class BubbleSort {

	public static void main(String[] args) {
		int arraynumber[]=new int[]{11,3,14,1,8,64,33,2,4};
		
		for(int i=0;i<arraynumber.length-1;i++){
			
			for(int j=i+1;j<arraynumber.length;j++){
				if(arraynumber[i]>arraynumber[j]){
					int swapvar=arraynumber[i];
					arraynumber[i]=arraynumber[j];
					arraynumber[j]=swapvar;
				}	
			}	
		}
		
		for (int i=0;i<arraynumber.length;i++){
			
			System.out.println("arraysort := "+ arraynumber[i]);
		}
		
	}
	
	
}
