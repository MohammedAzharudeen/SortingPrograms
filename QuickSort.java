package SortingPrograms;

import java.util.*;                                                          //unstable sorting algorithm with Time Complexity based on Pivot.
                                                                             //best case [T.C -> O(n log n) & S.C -> O(log n).
public class QuickSort {                                                     //worst case [T.C -> O(n^2) & S.C -> O(n).
	
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
	static int partition(int[] arr, int start, int end)
	{

	    int pivot = arr[end];
	    int i = start - 1;
	 
	    for(int j = start; j < end; j++)
	    {
	        if (arr[j] < pivot)
	        {
	            swap(arr, ++i, j);
	        }
	    }
	    swap(arr, i + 1, end);
	    return (i + 1);
	}
	
	static void quickSort(int[] arr, int start, int end)
	{
	    if (start < end)
	    {
	        int pi = partition(arr, start, end);
	        quickSort(arr, start, pi - 1);
	        quickSort(arr, pi + 1, end);
	    }
	}
	
	static void printArray(int[] arr, int size)
	{
	    for(int i = 0; i < size; i++)
	        System.out.print(arr[i] + " ");
	         
	    System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array :");
		int n = sc.nextInt();
		int[] arr = new int[n];
	    n = arr.length;
	    System.out.println("Enter the array elements :");
	    for(int i=0;i<n;i++) {
	    	arr[i] = sc.nextInt();
	    }
	    sc.close();
	    
	    System.out.println("Array elements before sort :");
	    for(int i=0;i<n;i++) {
	    	System.out.print(arr[i]+" ");
	    }System.out.println();
	    
	    quickSort(arr, 0, n - 1);
	    System.out.println("Array elements after sort :");
	    printArray(arr, n);
	    
		System.out.println("-------------------------------------------------");

	}

}
