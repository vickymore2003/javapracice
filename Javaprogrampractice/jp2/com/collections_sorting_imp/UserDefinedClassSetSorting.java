package com.collections_sorting_imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class employee implements Comparable<employee>{
	int id;
	String name;
	public employee(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	@Override
	public int compareTo(employee empobj) {
		// TODO Auto-generated method stub
		if(this.id==empobj.id){
			return 0;
			
		}else if(this.id>empobj.id){
			
			return 1;
		}else if(this.id<empobj.id)
		{
			return -1;
		}
		return id;
	}
	
	
}



public class UserDefinedClassSetSorting {

	public static void main(String[] args) {
		
		employee e1=new employee(1, "sachin");
		employee e2=new employee(4, "funde");
		employee e3=new employee(3, "shital");
		employee e4=new employee(2, "funde");
		Set<employee> setobj=new HashSet<employee>();
		
		setobj.add(e1);
		setobj.add(e2);
		setobj.add(e3);
		setobj.add(e4);
		
		ArrayList<employee> arrobj=new ArrayList<employee>(setobj);
		Iterator itr=arrobj.iterator();
		System.out.println("before sort");
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		//System.out.println("arrylist"+arrobj.get(0).id);
		Collections.sort(arrobj);
		
		
		for(employee e:arrobj){
			
			System.out.println(e.id);
			System.out.println(e.name);
			
		}
		
	}
	
	
	
	
}
