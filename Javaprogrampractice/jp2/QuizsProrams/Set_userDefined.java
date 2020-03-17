package QuizsProrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;



class Student implements Comparable<Student>{
	 
    int rollNumber;
    
    Student(int n){
        rollNumber = n;
    }

    @Override
    public boolean equals(Object obj){
    	if(obj==this){
			return true;
		}else if(obj!=null && obj instanceof Student){
			   Student e=(Student)obj;
			  return (e.rollNumber==this.rollNumber );
			}
		return false;	
    }
    
    @Override
	public int hashCode(){	
		//retrun internal implementation +20; 
		return this.rollNumber+3;
	}
    
	@Override
	public int compareTo(Student obj) {
		// TODO Auto-generated method stub
		if(obj.rollNumber ==this.rollNumber){
			return 0;
		}else if(this.rollNumber >obj.rollNumber ){
			return 1;
		}else{
			return -1;
		}
	}
}

public class Set_userDefined {

	
	public static void main(String[] args) {
		 
        Set<Student> students = new HashSet<Student>();
        
        students.add(new Student(1));
        students.add(new Student(3));
        students.add(new Student(4));
        students.add(new Student(1));
        students.add(new Student(3));
        
        ArrayList<Student> a=new ArrayList<Student>(students);
        
        System.out.println("size:= "+students.size());
        Collections.sort(a);
        for(Student a1:a){
        	System.out.println(a1.rollNumber);
        }
    }
}
