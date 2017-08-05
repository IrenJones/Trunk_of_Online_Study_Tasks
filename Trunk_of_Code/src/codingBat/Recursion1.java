package codingBat;

public class Recursion1 {

	public int factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return factorial(n - 1) * n;
	}

	public int bunnyEars(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		if (bunnies == 1) {
			return 2;
		}
		return 2 + bunnyEars(bunnies - 1);
	}

	public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n <= 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public int bunnyEars2(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		int ears = (bunnies % 2 == 0) ? 3 : 2;
		return ears + bunnyEars2(bunnies - 1);
	}

	public int triangle(int rows) {
		if (rows <= 1) {
			return rows;
		} else {
			return triangle(rows - 1) + rows;
		}
	}

	public int sumDigits(int n) {
		if (n / 10 < 1) {
			return n;
		} else {
			return sumDigits(n / 10) + n % 10;
		}
	}

	public int count7(int n) {
		if (n / 10 < 1) {
			return n == 7 ? 1 : 0;
		} else {
			int value = n % 10 == 7 ? 1 : 0;
			return count7(n / 10) + value;
		}
	}

	public int count8(int n) {
		if (n / 10 < 1) {
			return n == 8 ? 1 : 0;
		} else {
			int value = n % 10 == 8 ? 1 : 0;
			int adding = value == 1 && n / 10 % 10 == 8 ? 1 : 0;
			return count8(n / 10) + value + adding;
		}
	}

	public int powerN(int base, int n) {
		if (n == 0) {
			return 1;
		} else {
			return powerN(base, n - 1) * base;
		}
	}

	public int countX(String str) {
		if (str.length() <= 1) {
			return "x".equals(str) ? 1 : 0;
		}
		int count = "x".equals(str.substring(0, 1)) ? 1 : 0;
		return count + countX(str.substring(1, str.length()));
	}

	public int countHi(String str) {
		if (str.length() <= 2) {
			return "hi".equals(str) ? 1 : 0;
		}
		int count = "hi".equals(str.substring(0, 2)) ? 1 : 0;
		return count + countHi(str.substring(1, str.length()));
	}

	public String changeXY(String str) {
		if (str.length() <= 1) {
			return "x".equals(str) ? "y" : str;
		}
		String res = "x".equals(str.substring(0, 1)) ? "y" : str.substring(0, 1);
		return res + changeXY(str.substring(1, str.length()));
	}

	public String changePi(String str) {
		if (str.length() <= 2) {
			return "pi".equals(str) ? "3.14" : str;
		}
		if ("pi".equals(str.substring(0, 2))) {
			return "3.14" + changePi(str.substring(2, str.length()));
		} else {
			return str.substring(0, 1) + changePi(str.substring(1, str.length()));
		}
	}

	public String noX(String str) {
		if (str.length() <= 1) {
			return "x".equals(str) ? "" : str;
		}
		String res = "x".equals(str.substring(0, 1)) ? "" : str.substring(0, 1);
		return res + noX(str.substring(1, str.length()));
	}

	public boolean array6(int[] nums, int index) {
		if (index >= nums.length) {
			return false;
		}
		return nums[index] == 6 || array6(nums, index + 1);
	}

	public int array11(int[] nums, int index) {
		if (index >= nums.length) {
			return 0;
		}
		int count = nums[index] == 11 ? 1 : 0;
		return count + array11(nums, index + 1);
	}

	public boolean array220(int[] nums, int index) {
		if (index + 1 >= nums.length || nums.length < 2) {
			return false;
		}
		boolean res = nums[index + 1] == nums[index] * 10 ? true : false;
		return res || array220(nums, index + 1);
	}

	public String allStar(String str) {
		if (str.length() <= 1) {
			return str;
		}
		return str.substring(0, 1) + "*" + allStar(str.substring(1, str.length()));
	}

	public String pairStar(String str) {
		if (str.length() <= 1) {
			return str;
		}
		String res = str.substring(0, 1);
		if (str.substring(0, 1).equals(str.substring(1, 2))) {
			res += "*";
		}

		return res + pairStar(str.substring(1, str.length()));
	}

	public String endX(String str) {
		if (str.length() <= 1) {
			return str;
		}
		if (str.substring(0, 1).equals("x")) {
			return endX(str.substring(1, str.length())) + "x";
		} else {
			return str.substring(0, 1) + endX(str.substring(1, str.length()));
		}
	}

	public int countPairs(String str) {
		if (str.length() <= 2) {
			return 0;
		}
		int count = 0;
		if (str.substring(0, 1).equals(str.substring(2, 3))) {
			count++;
		}
		return count + countPairs(str.substring(1, str.length()));
	}

	public int countAbc(String str) {
		if (str.length() < 3) {
			return 0;
		}

		int count = 0;
		if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {
			count++;
		}
		return count + countAbc(str.substring(1, str.length()));
	}

	public int count11(String str) {
		if (str.length() < 2) {
			return 0;
		}

		int count = 0;
		if (str.substring(0, 2).equals("11")) {
			count++;
		}
		return count + count11(str.substring(1 + count, str.length()));
	}

	public String stringClean(String str) {
		if (str.length() <= 1) {
			return str;
		}
		if (str.charAt(0) == str.charAt(1)) {
			return stringClean(str.substring(1, str.length()));
		}
		return str.charAt(0) + stringClean(str.substring(1, str.length()));
	}

	public int countHi2(String str) {
		int len = str.length();
		if (len < 2) {
			return 0;
		}
		int res = 0;
		if (str.substring(len - 2).equals("hi")) {
			if ((len > 2 && str.charAt(len - 3) != 'x') || len == 2) {
				res++;
			}
		}
		return res + countHi2(str.substring(0, len - 1));
	}

	public String parenBit(String str) {
		if (str.length() < 1) {
			return str;
		}
		if (str.charAt(0) == '(') {
			if (str.charAt(str.length() - 1) == ')') {
				return str;
			} else {
				return parenBit(str.substring(0, str.length() - 1));
			}
		} else {
			return parenBit(str.substring(1));
		}
	}

	public boolean nestParen(String str) {
		if (str.length() < 2) {
			if (!(str.equals("(") || str.equals(")"))) {
				return true;
			} else {
				return false;
			}
		}
		if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
			return nestParen(str.substring(1, str.length() - 1));
		} else {
			return false;
		}
	}

	public int strCount(String str, String sub) {
		if (str.length() < sub.length()) {
			return 0;
		}
		if (str.substring(0, sub.length()).equals(sub)) {
			return 1 + strCount(str.substring(sub.length()), sub);
		} else {
			return strCount(str.substring(1), sub);
		}
	}

	public boolean strCopies(String str, String sub, int n) {
		if (str.length() < sub.length()) {
			if (n <= 0) {
				return true;
			} else {
				return false;
			}
		}
		if (str.substring(0, sub.length()).equals(sub)) {
			return strCopies(str.substring(1), sub, n - 1);
		} else {
			return strCopies(str.substring(1), sub, n);
		}
	}

	public int strDist(String str, String sub) {
		if (str.length() < sub.length()) {
			return 0;
		} else if (str.substring(0, sub.length()).equals(sub)) {
			if (str.substring(str.length() - sub.length()).equals(sub)) {
				return str.length();
			} else {
				return strDist(str.substring(0, (str.length() - 1)), sub);
			}
		} else {
			return strDist(str.substring(1), sub);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
