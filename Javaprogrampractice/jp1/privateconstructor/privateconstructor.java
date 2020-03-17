package privateconstructor;

 class privateconst {

	private int i=20;
	
		
	private privateconst(){
		i=21;
	}
	
	public static void main(String[] args) {
		privateconst p=new privateconst();	
	}
	
	
}
public class privateconstructor{
	public static void main(String[] args) {
		//privateconst p=new privateconst();	
	}
	
	
}