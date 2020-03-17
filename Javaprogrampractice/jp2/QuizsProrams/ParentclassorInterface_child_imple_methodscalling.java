package QuizsProrams;

class parent{
	
	int id=0;
	public void msg(){
		
		System.out.println("parent ");
	}
	public void overide(){
		
		System.out.println("parent class override method");
	}
	
}

interface trialinterface{
	
	public void m1();
	public void m2();
	default void show(){
		System.out.println("interface show implementation is done");
		
	}
	
}
public class ParentclassorInterface_child_imple_methodscalling extends parent implements trialinterface {
// rules for accesing methods on child classes and parent or interface refrence..
	
	public static void main(String[] args) {
		
		
		parent p=new ParentclassorInterface_child_imple_methodscalling();
		
		// p is parent class refrecnce but it an object of child class
		// on p refrence we can access the parent class all methods and members but not meyhods of child class.
		//it access only overrided methods.
		
		System.out.println(p.id);
		p.msg();
		
		
		// p.m1(); here we can not acess the child class m1 and m2  methods because p is just an parent class refrecnce so it can not child classes methods.
	    // it access overrided methods only.
		
		
		
		
		p.overide();// u can access overrided method only.
		
		// now to access p.m1(); method we need to do type casting into that class object
		
		
		((ParentclassorInterface_child_imple_methodscalling)p).m1();   //this way we can access the child class methods.
		((ParentclassorInterface_child_imple_methodscalling)p).m2();   //this way we can access the child class methods.
		
		///   now interface refrence accessibility.
		
		
		trialinterface t=new ParentclassorInterface_child_imple_methodscalling();
		t.m1();
		t.m2();
		t.show();// this access interface show method if this class doesnt override the show method
		
		
		//t.override(); here t interface refrence can not access override method as it is not declared in interface.
		
		// so type cast it and access it 
		((ParentclassorInterface_child_imple_methodscalling)t).overide();    // done
		// to access m1 and m2 we need to create an object of class.
		
		ParentclassorInterface_child_imple_methodscalling p1=new ParentclassorInterface_child_imple_methodscalling();
		p1.m1();
		p1.m2();
		
		
		
	}
	
	
@Override
public void overide(){
		
		System.out.println("child class override method");
	}

@Override
public void m1() {
	// TODO Auto-generated method stub
	System.out.println("m1");
}

@Override
public void m2() {
	// TODO Auto-generated method stub
	
	System.out.println("m2");
}
	
	/*
public void show(){
	System.out.println("class show");
}
	*/
	
	
}
