package hackerRank.java.intro;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		int i = 1;
		while (in.hasNext()) {
			s = in.nextLine();
			System.out.println(i + " " + s);
			i++;
		}
		in.close();
	}
}
