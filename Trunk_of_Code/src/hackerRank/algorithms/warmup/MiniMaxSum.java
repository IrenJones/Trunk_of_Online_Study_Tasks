package hackerRank.algorithms.warmup;

import java.util.Scanner;

public class MiniMaxSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 5;
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < 5; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		long[] sum = new long[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					sum[i] += arr[j];
				}
			}
		}
		long maxi = sum[0];
		long mini = sum[0];

		for (int i = 0; i < sum.length; i++) {
			if (sum[i] > maxi) {
				maxi = sum[i];
			}
			if (sum[i] < mini) {
				mini = sum[i];
			}
		}
		System.out.println(mini + " " + maxi);
	}
}
