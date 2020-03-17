package com.arrayrotation;

public class arrayrotation {
	
	
    void leftRotatebyOne(int arr[], int n,int d) 
    {
        int temp,j=0;
        
        for (int i = 0; i < d; i++){
        temp = arr[0];
        for ( j = 0; j < n - 1; j++){
            arr[j] = arr[j + 1];
        }
        arr[j] = temp;
        }
    }
 
    /* utility function to print an array */
    void printArray(int arr[], int n) 
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    // Driver program to test above functions
    public static void main(String[] args) 
    {
    	arrayrotation rotate = new arrayrotation();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotatebyOne(arr, 7,2);
        rotate.printArray(arr, 7);
    }
}
