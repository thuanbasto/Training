/*
	@Author : thuan
	@Date : May 9, 2021
*/

package assignment_401;

public class Exercise1 {
	static void merge(int arr[], int l, int m, int r){
	    int n1 = m - l + 1;
	    int n2 = r - m;
	 
	    // Create temp arrays
	    int L[] = new int [n1]; 
	    int R[] = new int [n2];
	 
	    // Copy data to temp arrays L[] and R[]
	    for (int i = 0; i < n1; i++)
	        L[i] = arr[l + i];
	    for (int j = 0; j < n2; j++)
	        R[j] = arr[m + 1 + j];
	 
	    // Merge the temp arrays back into arr[l..r]
	 
	    // Initial index of first subarray
	    int i = 0;
	 
	    // Initial index of second subarray
	    int j = 0;
	 
	    // Initial index of merged subarray
	    int k = l;
	    
	    // arr = 38 27 43 3 9 81 10
		// l = 0, r = 1 => m = 0 
		// n1 = 1 , n2 = 1
		// L = 38 , R = 27
	    // arr[0] = 27 => arr = 27 27 43 3 9 81 10 => k = 1 , j = 1
	    // arr[1] = 38 => arr = 38 27 43 3 9 81 10 => k = 2 , i = 1
	    
	    // arr = 27 38 3 43 9 81 10
	    // l = 0, r = 3 => m = 1
	    // n1 = 2 , n2 = 2
	    // L = 27 38 , R = 3 43
	    // 27 > 3 => arr[0] = 3 => arr = 3 27 43 3 9 81 10 => k = 1 , j = 1 , i = 0
	    // 27 < 43 => arr[1] = 27 => arr = 3 27 43 3 9 81 10 => k = 2 , j = 1 , i = 1
	    // 38 < 43 => arr[2] = 38 => arr = 3 27 38 3 9 81 10 => k = 3 , j = 1 , i = 2
	    // arr[3] = 43 => arr = 3 27 38 43 9 81 10 
	    
	    while (i < n1 && j < n2) {
	        if (L[i] <= R[j]) {
	            arr[k] = L[i];
	            i++;
	        }
	        else {
	            arr[k] = R[j];
	            j++;
	        }
	        k++;
	    }
	 
	    // Copy the remaining elements of
	    // L[], if there are any
	    while (i < n1) {
	        arr[k] = L[i];
	        i++;
	        k++;
	    }
	 
	    // Copy the remaining elements of
	    // R[], if there are any
	    while (j < n2) {
	        arr[k] = R[j];
	        j++;
	        k++;
	    }
	}
	// arr = 38 27 43 3 9 81 10
	// l = 0 , r = 6
	// m = 0 + 6/3 = 3 => arr1 = 38 27 43 3 , arr2 = 9 81 10
	// rec1 	: l = 0, r = 3 => m = 1 => arr1 = 38 27 , arr2 = 43 3 => arr = 3 27 38 43 9 81 10 (3)
	// rec1.1.1 : l = 0, r = 1 => m = 0 => arr1 = 38 , arr2 = 27 => arr = 27 38 43 3 9 81 10 (1)
	// rec1.2.1 : l = 2, r = 3 => m = 2 => arr1 = 43 , arr2 = 3 => arr = 27 38 3 43 9 81 10 (2)
	// rec2 	: l = 4 , r = 6 => m = 5 => arr1 = 9 81 , arr2 = 10
	// rec2.1.1 : l = 4 , r = 5 => m = 4 => arr1 = 9 , arr2 = 91
	public static void mergeSort(int arr[],int l,int r){  
	    if(l >= r){ 
	        return;//returns recursively
	    }
	    int m = l + (r-l)/2;
	    mergeSort(arr,l,m);
	    mergeSort(arr,m+1,r);
	    merge(arr,l,m,r);
	}
	
	public static void main(String[] args) {
		int arr[] = {38,27,43,3,9,81,10};
		mergeSort(arr, 0, 6);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
