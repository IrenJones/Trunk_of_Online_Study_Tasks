package codingBat;

import java.util.ArrayList;
import java.util.List;

public class AP1 {

	public boolean scoresIncreasing(int[] scores) {
		boolean res = true;
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] > scores[i + 1]) {
				res = false;
				break;
			}
		}
		return res;
	}

	public boolean scores100(int[] scores) {
		boolean res = false;
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] == 100 && scores[i + 1] == 100) {
				res = true;
				break;
			}
		}
		return res;
	}

	public boolean scoresClump(int[] scores) {
		boolean res = false;
		for (int i = 0; i < scores.length - 2; i++) {
			if (scores[i + 1] - scores[i] <= 2 && scores[i + 2] - scores[i + 1] <= 2
					&& scores[i + 2] - scores[i] <= 2) {
				res = true;
				break;
			}
		}
		return res;
	}

	public int scoresAverage(int[] scores) {
		int avg1 = 0;
		int avg2 = 0;
		for (int i = 0; i < scores.length / 2; i++) {
			avg1 += scores[i];
		}
		for (int i = scores.length / 2; i < scores.length; i++) {
			avg2 += scores[i];
		}
		avg1 /= scores.length / 2;
		avg2 /= scores.length / 2;
		return avg1 > avg2 ? avg1 : avg2;
	}

	public int wordsCount(String[] words, int len) {
		int res = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == len) {
				res++;
			}
		}
		return res;
	}

	public String[] wordsFront(String[] words, int n) {
		String[] res = new String[n];
		for (int i = 0; i < n; i++) {
			res[i] = words[i];
		}
		return res;
	}

	public List<?> wordsWithoutList(String[] words, int len) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() != len) {
				list.add(words[i]);
			}
		}
		return list;
	}

	public boolean hasOne(int n) {
		boolean result = false;
		while (n > 0) {
			if (n % 10 == 1) {
				result = true;
			}
			n /= 10;
		}
		return result;
	}

	public static boolean dividesSelf(int n) {
		boolean result = true;
		int number = n;
		while (number > 0) {
			int nu = number % 10;
			if (nu == 0 || (n - n / (nu) * nu) != 0) {
				result = false;
				break;
			}
			number /= 10;
		}
		return result;
	}

	public int[] copyEvens(int[] nums, int count) {
		int[] res = new int[count];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0 && j < count) {
				res[j] = nums[i];
				j++;
			}
		}
		return res;
	}

	public int[] copyEndy(int[] nums, int count) {
		int[] res = new int[count];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] >= 0 && nums[i] <= 10 || nums[i] >= 90 && nums[i] <= 100) && j < count) {
				res[j] = nums[i];
				j++;
			}
		}
		return res;
	}

	public int matchUp(String[] a, String[] b) {
		int count = 0;
		if (a.length > b.length) {
			count = calculatingCount(b, a);
		} else {
			count = calculatingCount(a, b);
		}
		return count;
	}

	public int calculatingCount(String[] a, String[] b) {
		int res = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].length() > 0 && b[i].length() > 0 && a[i].charAt(0) == b[i].charAt(0)) {
				res++;
			}
		}
		return res;
	}

	public int scoreUp(String[] key, String[] answers) {
		int res = 0;
		for (int i = 0; i < key.length; i++) {
			if (!"?".equals(answers[i])) {
				if (answers[i].equals(key[i])) {
					res += 4;
				} else {
					res -= 1;
				}
			}
		}
		return res;
	}

	public String[] wordsWithout(String[] words, String target) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			if (!target.equals(words[i])) {
				list.add(words[i]);
			}
		}
		return list.toArray(new String[list.size()]);
	}
	

	public static void main(String[] args) {
		dividesSelf(128);
	}

}
