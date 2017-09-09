package sortings;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		Random r = new Random();

		int n = 30;

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = r.nextInt(10);
		}

		insertSorting(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void insertSorting(int[] arr) {

		for (int i = 1; i < arr.length; ++i) {
			int elem = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > elem) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = elem;
		}
	}
}
