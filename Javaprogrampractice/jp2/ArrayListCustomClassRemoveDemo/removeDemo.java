package ArrayListCustomClassRemoveDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


//custom class type of arraylist can not remove the element from arraylist as it does not oveeride the equals method
 class Employee4 {
	 
    private int id;
    
    private String name;
    
    Employee4(int id, String name){
        this.id = id;
        this.name = name;
    }
    
}

public class removeDemo {

	
public static void main(String[] args) {
        
	HashMap<String,Integer> h=new HashMap<String,Integer>();
	
	
	
	
        List<String> countries = new ArrayList<String>();
        
        countries.addAll(Arrays.asList("Australia","Canada","India","USA"));
                        
        countries.remove(new String("USA"));
        
        System.out.print(countries.size());
 
        List<Employee4> empList = new ArrayList<Employee4>();
        
        empList.add(new Employee4(1,"A"));
        empList.add(new Employee4(1,"B"));
        empList.add(new Employee4(1,"C"));
                        
        empList.remove(new Employee4(1,"A"));// it will not remove the object from arraylist it has not implemented or ovveride the equals method
        // as it is wrrpaer classes and String claases oveerides it so it removes internally equals gets checked.
        
        System.out.print(empList.size());
        
    }
}
