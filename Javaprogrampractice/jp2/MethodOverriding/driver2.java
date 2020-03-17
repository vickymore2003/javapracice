package MethodOverriding;

import java.io.FileNotFoundException;
import java.io.IOException;

class a {

	
	protected void hello()throws IOException{
		
		
		System.out.println("hello a");
	}
	
	 static void sleep() {
	        System.out.println("Animal sleeps");
	    }
	
	
	
	
}

class b extends a{
	
	//we can't overriddent the data members in runtime polymorphisam
	//Rule #1: Only inherited methods can be overridden.
	//Rule #2: Final and static methods cannot be overridden.
	//Rule #3: The overriding method must have same argument list.
	//Rule #4: The overriding method must have same return type (or subtype).
	//Rule #5: The overriding method must not have more restrictive access modifier
	//Rule #6: The overriding method must not throw new or broader checked exceptions.
	//Rule #7: Use the super keyword to invoke the overridden method from a subclass.
	//super.overridenmethod()
	//
	//Rule #10: A static method in a subclass may hide another static one in a superclass, and that’s called hiding.
	// #11: The synchronized modifier has no effect on the rules of overriding.
   //Rule #12: The strictfp modifier has no effect on the rules of overriding.
	//
	//next>><<prev
	//Covariant Return Type
	//The covariant return type specifies that the return type may vary in the same direction as the subclass.

	//Before Java5, it was not possible to override any method by changing the return type. But now, since Java5, it is possible to override method by changing the return type 
		//	if subclass overrides any method whose return type is Non-Primitive but it changes its return type to subclass type
	
	@Override
	public void hello() throws FileNotFoundException{//overiding method should not have more restrictive access modifiers means .. access modifer of subclass shoudl be equal or
	   //greater than overriden method
		
		
		System.out.println("hello b ");
	}
   
   static void sleep() {
       System.out.println("Dog sleeps");
   }
	
	void dosomething(){
		
		sleep();//accesinng b method
		super.sleep();
		a.sleep();
	}
}
public class driver2{
	
	
	public static void main(String[] args) {
		
		System.out.println("1");
		
		a a1=new b();
	    b b1=new b();
	    b1.dosomething();
	    
		try {
			a1.hello();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}