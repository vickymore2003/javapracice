package QuizsProrams;

import java.util.LinkedList;

public class LinkedList_quzi {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(1);
		list.addFirst(2);
		list.addLast(3);
		list.addFirst(4);
		
		for(Integer i:list){
			
			System.out.print(i);
			
		}
		
		list.removeLast();
		
		for(Integer i:list){
			
			System.out.println(i);
			
		}
		
		list.remove();
		
		for(Integer i:list){
			
			System.out.print(i);
		}
		
		
	}
	
	
}
