package hackerRank.java.strings;

import java.util.Scanner;

public class JavaStringsTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		s = s.trim();
		if (s.equals("")) {
			System.out.println("0");
			return;
		}
		String[] sa = s.split("[ .,?!'_@]+");
		System.out.println(sa.length);
		for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);
		}
		scan.close();
	}

}
