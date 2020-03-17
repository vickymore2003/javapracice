package QuizsProrams;

public class ArrayQuiz {

	public static void doit(int ad[]){
		
		ad[0]=99;
	}
	
	
	public static void main(String[] args) {
		
		
		int ar[]={1,2,3,4,5};
		
		doit(ar);//refrene are pointing to same object
		for(int i=0;i<ar.length;i++){
			
			System.out.println(ar[i]);
			
		}
		
	}
}
