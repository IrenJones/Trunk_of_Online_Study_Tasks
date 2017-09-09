package sortings;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		Random r = new Random();

		int n = 30;

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = r.nextInt(10);
		}

		mergeSorting(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSorting(int[] arr) {
		
		partition (arr, 0, arr.length -1);
	}

	private static void partition(int[] arr, int i, int j) {
		
		if (i>=j){
			return;
		}
		int mid = i+ (j-i)/2;
		
		partition(arr, i, mid);
		partition (arr, mid+1, j);
		merge(arr, i, mid, j);
		
	}

	private static void merge(int[] arr, int lo, int mid, int hi) {
		
		int [] a = new int[arr.length];
		
		System.arraycopy(arr, 0, a, 0, arr.length);
		
		
		int i = lo; int j = mid+1;
		
		for (int k = lo; k <= hi; k++) {
			
			if (i > mid) { 
				arr[k] = a[j++];  
				
			} else if (j > hi) {  
				arr[k] = a[i++];  
			} else if (a[j] < a[i]) {  

				arr[k] = a[j++];
			}
			else {
				arr[k] = a[i++]; 
			}
		}
		
		
	}

}
