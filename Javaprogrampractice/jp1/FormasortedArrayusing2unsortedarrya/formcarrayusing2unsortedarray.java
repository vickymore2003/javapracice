package FormasortedArrayusing2unsortedarrya;

import java.util.Arrays;

public class formcarrayusing2unsortedarray {

	public static void main(String[] args) 
	{
        int a[]=new int[]{4,10,5,6,3};
        int b[]=new int[]{13,1,2,7,0};
        int temp;
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int j=0;j<a.length;j++)
        {
  for(int i=0;i<b.length;i++)
  {
        if(a[j]>b[i])
        {
             temp=b[i];
             b[i]=a[j];
             a[j]=temp;
        }
  }
        }
        Arrays.sort(b);
  
  
  for(int c:a)
  {
        System.out.print(c+" ");
  }
  for(int d:b)
  {
        System.out.print(d+" ");
  }
  

		
		
		
	
	}
	

}
