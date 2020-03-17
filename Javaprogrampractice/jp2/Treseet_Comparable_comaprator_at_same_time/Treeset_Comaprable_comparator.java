package Treseet_Comparable_comaprator_at_same_time;

import java.util.Comparator;
import java.util.TreeSet;

class Employee_2 implements Comparable<Employee_2>{
	
    int id;
   
    String name;
   
   Employee_2(int id, String name){
       this.id = id;
       this.name = name;
   }

   @Override
   public int compareTo(Employee_2 emp) {
       return this.name.compareTo(emp.name);
   }
   
}
 // when we use comparator and  comaprable at same time then comparator will get precedence over comparable.means
//comparator will get execute.
 
 class EmployeeComparator implements Comparator<Employee_2>{
	 
	    @Override
	    public int compare(Employee_2 emp1, Employee_2 emp2) {
	        
	        if(emp2.id==emp1.id){
	        	
	        	return 0;
	        }else if(emp1.id>emp2.id){
	        	return 1;
	        }else{
	        	return -1;
	        }
	        
	    }
	 
	}
 
public class Treeset_Comaprable_comparator {

	public static void main(String[] args) {
		TreeSet<Integer> s=new TreeSet<Integer>();
		//s.comparator();
		
		
		TreeSet<Employee_2> empTreeSet = new TreeSet<Employee_2>(new EmployeeComparator());
		//empTreeSet.comparator();
		//TreeSet<Employee_2> empTreeSet = new TreeSet<Employee_2>(new EmployeeComparator());
	    Employee_2 emp1 = new Employee_2(20, "Clark");
	    Employee_2 emp2 = new Employee_2(24, "Bernie");
	    Employee_2 emp3 = new Employee_2(3, "Alex");
	    
	    empTreeSet.add(emp1);
	    empTreeSet.add(emp2);
	    empTreeSet.add(emp3);
	    
	    
	    for(Employee_2 emp : empTreeSet)
	                System.out.print(emp.name + " ");   

	}
		
}

