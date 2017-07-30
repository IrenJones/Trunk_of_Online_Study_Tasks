package hackerRank.java.intro;

import java.util.Scanner;

public class Task10 {
	static int B;
	static int H;
	static boolean flag;

	static {
		try {
			flag = true;
			Scanner in = new Scanner(System.in);
			B = in.nextInt();
			H = in.nextInt();
			in.close();
			if (H <= 0 || B <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}

	}
}
