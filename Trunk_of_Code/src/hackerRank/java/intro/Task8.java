package hackerRank.java.intro;

import java.util.Scanner;

public class Task8 {

	static String[] values = new String[] { "* byte", "* short", "* int", "* long" };

	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127) {
					print(1);
				} else if (x >= -32768 && x <= 32767) {
					print(2);
				} else if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1) {
					print(3);
				} else {
					print(4);
				}
				// Complete the code
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
	}

	private static void print(int n) {
		for (int i = n - 1; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}
}
