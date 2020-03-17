package Map_implementation_classes;

import java.util.Map;
import java.util.TreeMap;

class Book_ {    
int id;    
String name,author,publisher;    
int quantity;    
public Book_(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}

public class treemap_userdefinedClasswithWrapperClassaKey {

	public static void main(String[] args) {
		
		
		 //Creating map of Books    but key is interger which is wrapper so no need to implment comparable here
	    Map<Integer,Book_> map=new TreeMap<Integer,Book_>();    
	    //Creating Books    
	    Book_ b1=new Book_(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book_ b2=new Book_(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book_ b3=new Book_(103,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to map   
	    map.put(2,b2);  
	    map.put(1,b1);  
	    map.put(3,b3);  
	      
	    //Traversing map  
	    for(Map.Entry<Integer, Book_> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Book_ b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }   
		
	}
	 
	
	
}
