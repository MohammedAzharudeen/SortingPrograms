package SortingPrograms;

import java.util.Scanner;

public class SelectionSort {              //sorting with index
	
	public static void selectionSort(int arr[],int n) {
		for(int i=0;i<arr.length;i++) {
			int min_ind = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[min_ind]) {
					min_ind = j;          //searching for lower index
				}
			}
			int temp = arr[min_ind];      //swapping
			arr[min_ind] = arr[i];
			arr[i] = temp;
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array :");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the array elements before sort: ");
		for(int b=0;b<arr.length;b++) {
			arr[b] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("The array elements before sort are: ");
		for(int b=0;b<arr.length;b++) {
			System.out.print(arr[b]+" ");
		}System.out.println();
		
		System.out.println("The array elements after sort are: ");
		selectionSort(arr,n);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		
		System.out.println("-------------------------------------------------");

	}

}
