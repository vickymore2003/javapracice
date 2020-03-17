package HashcodeNEqualsImplementation;

import java.util.HashMap;

class Employee_{
	
	int id;
	String name;
	
	public Employee_(int id,String name){
		
		this.id=id;
		this.name=name;
	}
	
	
}
public class withoutOveridingEqualsnHashcode {

	
	/* hashcode and equals methods contract of java for method override in object class
	 * 
	 * 1. if 2 objects are equals using equals(Object o) method then their hashcodes must be same.
	 * 2. if 2 objects are having same hashcode then objects may or may not be equal
	 * 3.if 2 objects are having same addrees means refrences are pointing to same object then objects are equals.
	 * 4. for overriding the equals method u need to mandtory hashcode() method as well and vice versa
	 */
	
	public static void main(String[] args) {
		
		Employee_ e1=new Employee_(1,"sachin");
		Employee_ e2=new Employee_(1,"sachin");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
		System.out.println("e1 hashcode"+e1.hashCode());
		System.out.println("e2 hashcode"+e2.hashCode());
		
		HashMap<String,Integer> hashmap_forConcepts=new HashMap<String,Integer>();
		hashmap_forConcepts.put("Sachin", 111);
		hashmap_forConcepts.put("Sachin", 123);
	
		System.out.println("size of map"+hashmap_forConcepts.size());//one size .it gets override
		
		
		HashMap<Employee_,String> hashmap=new HashMap<Employee_,String>();
		hashmap.put(e1, "sachin");
		hashmap.put(e2, "sachin");
		System.out.println(hashmap.size());//size is 2 objects are different
		
		//String and Wrapper classes are ovverides equals and hashcode() method.
		
		HashMap<Integer,Integer> hash_int=new HashMap<Integer,Integer>();
		hash_int.put(1, 2);
		hash_int.put(1,2);
		
		
		System.out.println("hashmpa"+hash_int.size());
		
		HashMap<String,Integer> hash_string=new HashMap<String,Integer>();
		hash_string.put("Sachin",2);
		hash_string.put("Sachin", 33);
		System.out.println("size"+hash_string.size());
		
		
		
	}
	
	
	
}
