package QuizsProrams;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Set_of_shortObjects {

	
	public static void main(String[] args) {
		Set<Short> set = new HashSet<Short>();
		 
        for (Short i = 0; i < 10; i++) {
            set.add(i);
            set.remove(i - 1);//it is an integer not short object ...only object arg method is here 
        }
 
        System.out.println(set.size());
        Queue q= new PriorityQueue();
        Deque q1=new ArrayDeque();
        LinkedList<String> s=new LinkedList();
        
        
        
	}
}
