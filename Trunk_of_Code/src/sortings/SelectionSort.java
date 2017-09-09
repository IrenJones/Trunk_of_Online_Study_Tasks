package sortings;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
		Random r = new Random();

		int n = 30;

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = r.nextInt(10);
		}

		selectionSorting(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void selectionSorting(int[] arr) {
		
		for (int i=0;i<arr.length;i++){
			
			int mini = arr[i];
			int index = i;
			for(int j=i+1;j<arr.length;j++){
				if (mini > arr[j]){
					mini = arr[j];
					index = j;
				}
			}
			
			arr[index] = arr[i];
			arr[i] = mini;
		}
		
	}

}
