package com.collections_sorting_imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Sorting_String {

	public static void main(String[] args) {
		
		Set<String> setobj=new HashSet<String>();
		
		setobj.add("sachin");
		setobj.add("funde");
		setobj.add("sachinfunde");
		setobj.add("shital");
		
		Iterator itr=setobj.iterator();
		System.out.println("before the sorting the set");
		while(itr.hasNext()){

			System.out.println(itr.next());
			
		}
	  System.out.println("after sorting the set ");
	  
	  ArrayList<String> listobj=new ArrayList<String>(setobj);
	  Collections.sort(listobj);
	  System.out.println(listobj.toString());
	  
	}

}

