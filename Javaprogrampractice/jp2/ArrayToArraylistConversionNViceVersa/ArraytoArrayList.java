package ArrayToArraylistConversionNViceVersa;

import java.util.Arrays;

import java.util.List;

public class ArraytoArrayList {

	
	public static void main(String[] args) {
		  String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
		
		  @SuppressWarnings({ "unchecked", "rawtypes" })
		List<String> arraylist=  Arrays.asList(array);
		  
		 System.out.println(arraylist);
		 System.out.println(arraylist.get(0));
		  
		  
		
	}
}
