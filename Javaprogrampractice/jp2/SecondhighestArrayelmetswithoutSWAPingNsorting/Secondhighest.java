package SecondhighestArrayelmetswithoutSWAPingNsorting;

public class Secondhighest {

	public static void main(String[] args) {
		int elements[]=new int[]{5,7,3,2,1};
		int max_number=0;
		max_number=elements[0];
		for(int i=1;i<elements.length;i++){
			if(elements[i]>max_number){
			
				max_number=elements[i];
				
			}
			
		}
		
		System.out.println("max number "+max_number);
		
		for(int i=0;i<elements.length;i++){
			elements[i]=max_number-elements[i];
		}
		
		int smallest_difference_number=elements[0];
		for(int i=0;i<elements.length;i++){
			if(smallest_difference_number==0){
				smallest_difference_number=elements[i+1];
			}
			if(elements[i]<smallest_difference_number && elements[i]!=0){
				smallest_difference_number=elements[i];
			}
			
		}
		
		System.out.println("smallest_difference_number is := "+smallest_difference_number);
		
		System.out.println("2nd highest number is "+ (max_number-smallest_difference_number));
		
		
	}
	
	
	
}
