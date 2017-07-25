package hackerRank.algorithms.implementation;

import java.util.Scanner;

/**
 * 
 * Passed only first 6 tests :(
 *
 */

public class AppleAndOrange {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();

		int count = 0;
		int val = 0;
		for (int apple_i = 0; apple_i < m; apple_i++) {
			val = a + in.nextInt();
			if (val >= s && val <= t) {
				count++;
			}
		}
		System.out.println(count);
		count = 0;
		for (int orange_i = 0; orange_i < n; orange_i++) {
			val = b + in.nextInt();
			if (val >= s && val <= t) {
				count++;
			}
		}
		System.out.println(count);
	}
}
