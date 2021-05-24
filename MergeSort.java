package SortingPrograms;

import java.util.Scanner;

public class MergeSort {     
	
	public static void merger(int p[],int start,int mid,int end) {
		int i,j,k,ls = mid-start+1, rs = end-mid;
		int[] la = new int[ls];
		int[] ra = new int[rs];
		
		for(i=0;i<ls;i++) {
			la[i] = p[i+start];      //1st array is copied
		}
		for(j=0;j<rs;j++) {
			ra[j] = p[mid+1+j];      //2nd array is copied
		}
		i = j = 0;
		k = start;
		while(i<ls && j<rs) {
			if(la[i] <= ra[j]) {      //for original array
				p[k++] = la[i++];
			}else {
				p[k++] = ra[j++];
			}
		}
		while(i<ls) p[k++] = la[i++];     //copy leftover of left array
		while(j<rs) p[k++] = ra[j++];     //copy leftover of right array
	}
	
	public static void mergeSort(int a[],int start,int end) {     //most stable sort in all case with time complexity O(n log n)
		if(start < end) {
			int mid;
			mid = (start+(end-1))/2;
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			merger(a,start,mid,end);
		}
	}
	
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
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
		
		System.out.println("Given Array");
		printArray(arr);

		mergeSort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
		
		System.out.println("-------------------------------------------------");

	}

}
