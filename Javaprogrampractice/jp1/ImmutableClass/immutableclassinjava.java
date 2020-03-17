package ImmutableClass;

final class immutableclassinjava {

	//implementation is pending 
	
	
	// we can not modify the content of object in case of immutable class in java
	// make a final class
	// make all members as final also and no setter methods in class and all getter methods for all members in class
	
	
	final int number ;
	final String name;
	
	public immutableclassinjava (int number,String name){
		this.number=number;
		this.name=name;
	}
	
	public int getNumber(){
		return number;
	}
	
	public String getName(){
		return name;
	}
	
	
	public static void main(String[] args) {
		
		immutableclassinjava obj=new immutableclassinjava(12,"sachin");
		System.out.println("number"+ obj.getNumber() + "name :="+obj.getName());
		immutableclassinjava obj1=new immutableclassinjava(13,"sachinfunde");
		System.out.println("number "+ obj1.getNumber() + "name is "+ obj1.getName());
	}
	
	
	
	
}
