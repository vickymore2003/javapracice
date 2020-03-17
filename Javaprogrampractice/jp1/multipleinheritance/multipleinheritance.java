package multipleinheritance;


interface a1{
	default void show(){
		System.out.println("a1 show");
	}
	static int print(){
		
		return 1;
	}
}


interface a2{
	
	default void show(){
		
		System.out.println("a2 show");
	}

	
}

public class multipleinheritance implements a1,a2{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		a1.super.show();
		a2.super.show();
		System.out.println(a1.print());
		
	}
	
	public int print(){
		System.out.println(a1.print());
		return 0;
		
	}
	public static void main(String[] args) {
		multipleinheritance m=new multipleinheritance();
		m.show();
		m.print();
		
	}
	
}
