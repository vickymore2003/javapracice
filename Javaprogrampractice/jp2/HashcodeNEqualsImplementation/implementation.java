package HashcodeNEqualsImplementation;

import java.util.HashMap;

class Employee{
	
	int id;
	String name;
	
	public Employee(int id,String name){
		
		this.id=id;
		this.name=name;
	}
	
	@Override //overriding object class method equals
	public boolean equals(Object obj){
		if(obj==this){
			return true;
		}else if(obj!=null && obj instanceof Employee){
			   Employee e=(Employee)obj;
			  return (e.id==this.id && e.name.equals(this.name));
			}
		return false;	
	}
	
	@Override
	public int hashCode(){	
		//retrun internal implementation +20; 
		return this.id+3;
	}
	
	
}





public class implementation {

	/* hashcode and equals methods contract of java for method override in object class
	 * 
	 * 1. if 2 objects are equals using equals(Object o) method then their hashcodes must be same.
	 * 2. if 2 objects are having same hashcode then objects may or may not be equal
	 * 3.if 2 objects are having same addrees means refrences are pointing to same object then objects are equals.
	 * 4. for overriding the equals method u need to mandtory hashcode() method as well and vice versa
	 *  string and all wrrapper classes overrides the equals method 
	 */
	
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"sachin");
		Employee e2=new Employee(1,"sachin");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
		System.out.println("e1 hashcode:="+e1.hashCode());
		System.out.println("e2 hashcode:="+e2.hashCode());
		

		HashMap<Employee,String> hashmap=new HashMap<Employee,String>();
		hashmap.put(e1, "sachin");
		hashmap.put(e2, "sachin");
		System.out.println("size:="+hashmap.size());//size is 1 beacause 2 objects are different but we overrides the equals hascode method
		
	}


}