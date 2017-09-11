package sortings;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int n= 30;
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = r.nextInt(10);
		}
		
		bubbleSorting(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSorting(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if (arr[j] > arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
	}

}
