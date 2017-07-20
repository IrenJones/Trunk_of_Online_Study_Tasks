package hackerRank.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {
	static String timeConversion(String s) {
		String res = "";
		if (s.substring(s.length() - 2, s.length()).equals("PM")){
			if (s.substring(0, 2).equals("12")) {
				res += s.substring(0, s.length() - 2);
			} else {
				int hh = Integer.parseInt(s.substring(0, 2));
				hh += 12;
				res = Integer.toString(hh) + s.substring(2, s.length() - 2);
			}
		} else {
			if (s.substring(0, 2).equals("12")) {
				res += "00"+ s.substring(2, s.length() - 2);
			} else {
				res += s.substring(0, s.length() - 2);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
		in.close();
	}
}
