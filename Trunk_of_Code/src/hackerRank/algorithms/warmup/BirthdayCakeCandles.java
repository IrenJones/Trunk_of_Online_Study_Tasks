package hackerRank.algorithms.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {
	static int birthdayCakeCandles(int n, int[] ar) {
		int res = 0;
		int maxHeight = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				maxHeight = ar[i];
				res++;
			} else if (ar[i] == maxHeight) {
				maxHeight = ar[i];
				res++;
			} else if (ar[i] > maxHeight) {
				maxHeight = ar[i];
				res = 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
		in.close();
	}
}
