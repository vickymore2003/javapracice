package FindSubArrayfromArraySumEqualToNumber;

public class SumEqualtonumberofsubarray {

	
public static void main(String[] args) {
		
		int[] arr=new int[]{12, 5, 31, 13, 21, 8};
		int[] brr=new int[arr.length];
		
		int number=29,sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=0;
			System.out.println("i"+i);
			for(int j=i;j<arr.length;j++)
			{
				sum=sum+arr[j];
				
				if(sum==number)
				{
					System.out.println("Array element is "+i+" "+j);
					
					for(int k=i,f=0;k<=j;k++,f++)
					{
						brr[f]=arr[k];
						System.out.println(brr[f]);
					}
					return;
				}
				
			}
			
			//System.out.println("Their is no sub array");
		}
		
		
   }
}
