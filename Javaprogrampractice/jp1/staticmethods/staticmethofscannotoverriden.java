package staticmethods;
class A {
	   static void fun() {
	      System.out.println("A.fun()");
	   }
	   
	   public static void add(){
		   System.out.println("add in a");
	   }
	}
	 
	class B extends A { 
	   static void fun() {   
	      System.out.println("B.fun()");
	   }
	   public static void add(){
		   System.out.println("add in b");
	   }
	}
	 

public class staticmethofscannotoverriden {
		
	public static void main(String[] args) {
			A a = new B();
			A.fun();  // prints A.fun()
	      A.add();
	
		}
	
}
