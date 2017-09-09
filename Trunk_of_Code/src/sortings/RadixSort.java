package sortings;

import java.util.Arrays;
import java.util.Random;

public class RadixSort {

	public static void main(String[] args) {
		
		Random r = new Random();

		int n = 30;

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = r.nextInt(10);
		}

		radixSorting(arr, n);
		System.out.println(Arrays.toString(arr));


	}
	
	private static void radixSorting(int[] arr, int n) {
		int maxi = findMax(arr);
		int[] b = new int[n];
		
		for(int exp=1;maxi / exp > 0;exp*=10) {
			int[] count = new int[10];

			// find count of each last digit in arr
			for (int i = 0; i < n; i++) {
				int index = (arr[i] / exp) % 10;
				count[index]++;
			}
			
			// find actual position
			for (int i = 1; i < 10; i++) {
				count[i] += count[i - 1];
			}
			
			//
			for (int i = n - 1; i >= 0; i--) {
				int pos = (arr[i] / exp) % 10;
				count[pos]--;
				int index = count[pos];
				b[index] = arr[i];
			}
			
			// contains sorted numbers according to current digit
			for (int i = 0; i < n; i++) {
				arr[i] = b[i];
			}
		}
	}

	private static int findMax(int[] arr) {
		int result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (result < arr[i]) {
				result = arr[i];
			}
		}
		return result;
	}

}
