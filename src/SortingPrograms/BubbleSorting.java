package SortingPrograms;

import java.util.*;

public class BubbleSorting {      //Time Complexity O(n^2)
	public static void bubbleSort(int a[],int n) {
		int k,i;
		for(k=0;k<n-1;k++) {
			for(i=0;i<n-k-1;i++) {
				if(a[i]>a[i+1]) {
					int temp = a[i];     //Swapping
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
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
		bubbleSort(arr,n);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		
		System.out.println("-------------------------------------------------");
	}
}
