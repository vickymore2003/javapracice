package DesignPatterns;

public class SingletobDesignPattern_EarlyInstantiation {

	
	private static SingletobDesignPattern_EarlyInstantiation obj=new SingletobDesignPattern_EarlyInstantiation();
	
	private SingletobDesignPattern_EarlyInstantiation(){
		
		
	}
	
	public static SingletobDesignPattern_EarlyInstantiation getinstance(){
		return obj;
	}
	
	public static void main(String[] args) {
		
		obj=SingletobDesignPattern_EarlyInstantiation.getinstance();
		
	}
	
	
}
