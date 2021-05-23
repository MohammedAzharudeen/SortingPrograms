package SortingPrograms;

import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSort(int arr[],int n) {     // Time complexity O(n^2), Space Complexity O(1)
		int i,j;
		for(j=1;j<arr.length;j++) {
			int key = arr[j];
			i = j-1;
			while(i >= 0 && arr[i] > key) {
				arr[i+1] = arr[i];
				i = i-1;
			}
			arr[i+1] = key;
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
		insertionSort(arr,n);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		
		System.out.println("-------------------------------------------------");
	}

}
