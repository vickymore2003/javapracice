package ResizeArray;

import java.util.Arrays;



public class ResizeArray {

	public static void main(String[] args) {
		
		int a[]=new int[]{1,2,3};
		
		int b[]=Arrays.copyOf(a, 10);//10 is new size of array
		
		System.out.println(Arrays.toString(b));
		int c[]=new int[10];
		
		/*Copies an array from the specified source array, beginning at the specified position,
		 *  to the specified position of the destination array. A subsequence of array components ar
		 *  e copied from the source array referenced by src to the destination array referenced by dest. 
		 *  The number of components copied is equal to the length argument. The components at positions
		 *   srcPos through srcPos+length-1 in the source array are copied into positions destPos through
		 *    destPos+length-1, respectively, of the destination array.
		 */


	
		System.arraycopy(a, 0, c, 0,a.length);
		System.out.println(Arrays.toString(c));
		
		
	}
	
	
}
