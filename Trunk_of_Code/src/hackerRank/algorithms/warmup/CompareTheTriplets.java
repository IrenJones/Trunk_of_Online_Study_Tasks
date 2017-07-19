package hackerRank.algorithms.warmup;

import java.util.Scanner;

public class CompareTheTriplets {
	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
		int[] res = new int[2];
		int[] a = new int[] { a0, a1, a2 };
		int[] b = new int[] { b0, b1, b2 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] > b[i]) {
				res[0]++;
			} else if (a[i] < b[i]) {
				res[1]++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int[] result = solve(a0, a1, a2, b0, b1, b2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");
		in.close();
	}
}
