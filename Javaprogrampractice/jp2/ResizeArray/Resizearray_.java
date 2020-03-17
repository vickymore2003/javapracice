package ResizeArray;

public class Resizearray_ {

	
	public static void main(String[] args) {
		
		int a[]=new int[]{};
		//we can not modify array .
		for(int i=1,k=0;i<10;i++){
			
			a=new int[i];//new array is getting created
			a[k]=2;
			System.out.println(a.hashCode());
			System.out.println(a[i-1]);
			
		}
		
		
		
	}
}
