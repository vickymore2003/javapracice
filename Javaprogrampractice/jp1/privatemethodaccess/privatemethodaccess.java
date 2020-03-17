package privatemethodaccess;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public  class privatemethodaccess {

	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	      Return ret = new Return();
	      Class<?> clazz = ret.getClass();
	      Method method = clazz.getDeclaredMethod("rate");
	      method.setAccessible(true);
	      System.out.println(method.invoke(ret));
	   }
	
}

 class Return {
	
	   int price = 10, discount = 5;  
	   private int rate() { 
	   	System.out.println("Inside rate() method ");
	      return (price-discount); 
	   } 

}
