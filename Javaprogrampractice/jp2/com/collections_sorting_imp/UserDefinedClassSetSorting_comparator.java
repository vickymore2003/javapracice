package com.collections_sorting_imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class comparatorimp  {
	
	int id;
	String name;
	public comparatorimp(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	
}

class IdComaparator implements Comparator<comparatorimp>{

	
	
	
	@Override
	public int compare(comparatorimp obj1, comparatorimp obj2) {
		// TODO Auto-generated method stub
		if(obj1.id==obj2.id){
			return 0;
			
		}else if(obj1.id > obj2.id){
			
			return 1;
		}else {
			return -1;
		}
		
		
	}
	
	
	
}

class NameComaparator implements Comparator<comparatorimp>{

	
	
	
	@Override
	public int compare(comparatorimp obj1, comparatorimp obj2) {
		// TODO Auto-generated method stub
		return obj1.name.compareTo(obj2.name);
		
	}
	
	
	
}

public class UserDefinedClassSetSorting_comparator {

//using comaprator interface	
	
	
	public static void main(String[] args) {
		
		comparatorimp iobj=new comparatorimp(40, "sachin");
		comparatorimp iobj2=new comparatorimp(34, "shital");
		
		ArrayList<comparatorimp> arrlistobj=new ArrayList<comparatorimp>();
		arrlistobj.add(iobj);
		arrlistobj.add(iobj2);
		Collections.sort(arrlistobj,new IdComaparator());
		System.out.println("After sort");
		
		
		for(comparatorimp st: arrlistobj){  
			System.out.println(st.id+" "+st.name+" ");  
			}  
		//System.out.println(""+arrlistobj.get(0));
		System.out.println("After sort by name");
		Collections.sort(arrlistobj,new NameComaparator());
		System.out.println("After sort");
		
		for(comparatorimp st: arrlistobj){  
			System.out.println(st.id+" "+st.name+" ");  
			}  
	}
	
	
}
