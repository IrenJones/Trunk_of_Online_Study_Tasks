package codingBat;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> res = new HashMap<String, Integer>();

		for (int i = 0; i < strings.length; i++) {
			if (!res.containsKey(strings[i])) {
				res.put(strings[i], 0);
			}
		}

		return res;
	}

	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> res = new HashMap<String, Integer>();

		for (int i = 0; i < strings.length; i++) {
			if (!res.containsKey(strings[i])) {
				res.put(strings[i], strings[i].length());
			}
		}

		return res;
	}

	public Map<String, String> pairs(String[] strings) {
		Map<String, String> res = new HashMap<String, String>();

		for (int i = 0; i < strings.length; i++) {
			if (!res.containsKey(strings[i].charAt(0))) {
				res.put("" + strings[i].charAt(0), "" + strings[i].charAt(strings[i].length() - 1));
			}
		}

		return res;
	}

	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> res = new HashMap<String, Integer>();
		int count;
		for (int i = 0; i < strings.length; i++) {
			if (!res.containsKey(strings[i])) {
				res.put(strings[i], 1);
			} else {
				count = res.get(strings[i]);
				res.put(strings[i], count + 1);
			}
		}

		return res;
	}

	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> res = new HashMap<String, String>();
		String value;
		for (int i = 0; i < strings.length; i++) {
			if (!res.containsKey("" + strings[i].charAt(0))) {
				res.put("" + strings[i].charAt(0), strings[i]);
			} else {
				value = res.get("" + strings[i].charAt(0));
				res.put("" + strings[i].charAt(0), value + strings[i]);
			}
		}

		return res;
	}

	public static String wordAppend(String[] strings) {
		String result = "";
		Map<String, Integer> res = new HashMap<String, Integer>();
		int count;
		for (int i = 0; i < strings.length; i++) {
			if (!res.containsKey(strings[i])) {
				res.put(strings[i], 1);
			} else {
				count = res.get(strings[i]);
				res.put(strings[i], count + 1);
				if ((count + 1) % 2 == 0) {
					result += strings[i];
				}
			}
		}

		return result;
	}
	
	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> res = new HashMap<String, Boolean>();
		for (int i = 0; i < strings.length; i++) {
			if (!res.containsKey(strings[i])) {
				res.put(strings[i], false);
			} else {
				res.put(strings[i], true);
			}
		}

		return res;
	}

	public static void main(String[] args) {
		String[] arr = new String[] { "a", "b", "a", "c", "a", "d", "a" };
		System.out.println(wordAppend(arr));

	}

}
