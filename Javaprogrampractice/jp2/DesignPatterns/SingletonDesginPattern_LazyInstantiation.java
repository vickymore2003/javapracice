package DesignPatterns;

public class SingletonDesginPattern_LazyInstantiation {

	private static SingletonDesginPattern_LazyInstantiation obj;
	
	private SingletonDesginPattern_LazyInstantiation(){
		
	}
	public static SingletonDesginPattern_LazyInstantiation getinstance(){
		if(obj==null){
			return new SingletonDesginPattern_LazyInstantiation();
		}
		return obj;
	}
	
	public static void main(String[] args) {
		
		obj=SingletonDesginPattern_LazyInstantiation.getinstance();
		
	}
	
	
	
}
