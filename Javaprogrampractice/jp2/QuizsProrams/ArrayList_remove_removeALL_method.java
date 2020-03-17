package QuizsProrams;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_remove_removeALL_method {

	
	
	public static void main(String[] args) {
		
        List list = new ArrayList();
        
        list.add(10);
        list.add(10);
        
        list.remove(new Integer(10));//removes 1st matching occurances of element from arraylist
        list.remove(0);  //remove element from index
        
        //list.removeAll(arg0);
        
        System.out.print(list.size());
       
        
       // list.remove(new Integer(10));
        
        //System.out.print(list.size());
        
        List<Integer> list1 = new ArrayList<Integer>();
        
        list1.add(10);
        list1.add(10);
        
        System.out.print("after add"+list1.size());
        
        list1.remove(10);
        
        System.out.println(list1.size());
      //  TreeMap<String,Integer> t=new TreeMap<String,Integer>();
        
        
	}
}
