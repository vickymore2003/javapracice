package stringLengthWitoutUsingInbuiltLengthMethod;

public class usingStringindexOutofBoundsException {

	public static void main(String[] args) {
		
		String str="sachin";
		int i = 0;
		
		try{
			
			for (i=0;;i++){
			
			     str.charAt(i);
			
			
			}
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("lentgh is " +i);
		
	}
	
	
}
