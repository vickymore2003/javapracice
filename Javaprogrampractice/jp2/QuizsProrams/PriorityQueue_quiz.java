package QuizsProrams;

import java.util.PriorityQueue;

public class PriorityQueue_quiz {

	
	public static void main(String[] args) {
		
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
        pQueue.add("Apple");
        pQueue.add("Nokia");
        pQueue.add("Samsung");
        pQueue.add("Apple");
        
        System.out.print(pQueue.poll() + " " + pQueue.poll());
        System.out.print(" " + pQueue.peek() + " " + pQueue.poll());
		
		
	}
}
