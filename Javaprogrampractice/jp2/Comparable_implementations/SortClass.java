package Comparable_implementations;

import java.util.ArrayList;
import java.util.Collections;

class student implements Comparable<student>{
  
	int rollno;
	String name;
	int age;
	
	student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	
	
	
	
	
	
	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
	
		if(age==o.age){
			return 0;
		}else if(age>o.age){
			
			return 1;
			
		}else{
			return -1;
		}
		
	}
	
	
	
	
	
	
}


public class SortClass {

	public static void main(String[] args) {
		
		ArrayList<student> al=new ArrayList<student>();
		al.add(new student(12,"sac",21));
		al.add(new student(13,"ss",19));
		al.add(new student(14,"sss",18));
		
		Collections.sort(al);
		
		//System.out.println(al.toString());
		
		for(student st:al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
			}  
		
	}
	
	
	
	
	
}


