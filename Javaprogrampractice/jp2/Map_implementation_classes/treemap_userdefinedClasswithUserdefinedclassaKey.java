package Map_implementation_classes;

import java.util.Map;
import java.util.TreeMap;

class book_1 implements Comparable<book_1>{
	
	int id;    
	String name,author,publisher;    
	int quantity;    
	public book_1(int id, String name, String author, String publisher, int quantity) {    
	    this.id = id;    
	    this.name = name;    
	    this.author = author;    
	    this.publisher = publisher;    
	    this.quantity = quantity;    
	}
	@Override
	public int compareTo(book_1 obj) {
		// TODO Auto-generated method stub
		
		if(this.id==obj.id){
			
			return 0;
		}else if(this.id>obj.id){
			
			
			return 1;
			
		}else{
			
			return -1;
		}
		
	}   
	
	
}
public class treemap_userdefinedClasswithUserdefinedclassaKey {

	public static void main(String[] args) {
		
		
		 //Creating map of Books    but key is interger which is wrapper so no need to implment comparable here
	    Map<book_1,Integer> map=new TreeMap<book_1,Integer>();    
	    //Creating Books    
	    book_1 b1=new book_1(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    book_1 b2=new book_1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    book_1 b3=new book_1(103,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to map   
	    map.put(b2,2);  
	    map.put(b1,1);  
	    map.put(b3,3);  
	      
	    //Traversing map  
	    for(Map.Entry<book_1,Integer > entry:map.entrySet()){    
	        book_1 b=entry.getKey(); 
	        Integer val=entry.getValue();  
	        //System.out.println(b.id+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity +" "+val);   
	    }   
		
	}
	
	
}
