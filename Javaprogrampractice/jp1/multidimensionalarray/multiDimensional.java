package multidimensionalarray;

import java.util.ArrayList;
import java.util.Arrays;

class multiDimensional
{
    public static void main(String args[])
    {
        // declaring and initializing 2D array
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };
        int a[]=new int[3];
        System.out.println(Arrays.toString(a));
        
        // printing 2D array
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arr[i][j] + " ");
 
            System.out.println();
        }
        
        
        //program to convert arraylist to array.
        
        ArrayList<Integer> al=new ArrayList<>();
        
        al.add(20);
        
        Object arr2[]=al.toArray();
        
        System.out.println("ss " +arr2[0]);
        
        
    }
}