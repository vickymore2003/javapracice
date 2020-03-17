package ArrayToArraylistConversionNViceVersa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraytoarrayListConviseversa {

	
	public static void main(String[] args) {

		int a[]=new int[]{1,2,3};
		Integer[] a1=new Integer[]{1,4,5};
		List<Integer> aa1=	Arrays.asList(a1);
		List<int[]> aa=	Arrays.asList(a);
	
		System.out.println(aa1);
		int [] k=aa.get(0);
		System.out.println(k[2]); 
		
		ArrayList<String> arrylist=new ArrayList<String>();
		
		arrylist.add("sachin");
		arrylist.add("sachinfunde");
		arrylist.add("sachinfunde automation tester");

		
		Object[] arrobj= arrylist.toArray();
		
		System.out.println(arrobj[2]);
		
		
	}
}
