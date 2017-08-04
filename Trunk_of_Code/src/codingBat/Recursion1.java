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
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}