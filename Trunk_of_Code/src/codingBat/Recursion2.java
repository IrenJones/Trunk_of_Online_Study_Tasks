package codingBat;

public class Recursion2 {
	public boolean groupSum(int start, int[] nums, int target) {
		if (start >= nums.length) {
			if (target == 0) {
				return true;
			} else {
				return false;
			}
		}
		if (groupSum(start + 1, nums, target - nums[start])) {
			return true;
		}

		if (groupSum(start + 1, nums, target)) {
			return true;
		}
		return false;

	}

	public boolean groupSum6(int start, int[] nums, int target) {
		if (start >= nums.length) {
			if (target == 0) {
				return true;
			} else {
				return false;
			}
		}
		if (groupSum(start + 1, nums, target - nums[start])) {
			return true;
		}

		if (nums[start] != 6 && groupSum(start + 1, nums, target)) {
			return true;
		}
		return false;

	}

	public boolean groupNoAdj(int start, int[] nums, int target) {
		if (start >= nums.length) {
			if (target == 0) {
				return true;
			} else {
				return false;
			}
		}
		if (groupNoAdj(start + 2, nums, target - nums[start])) {
			return true;
		}

		if (groupNoAdj(start + 1, nums, target)) {
			return true;
		}
		return false;
	}

	public boolean groupSum5(int start, int[] nums, int target) {
		if (start >= nums.length) {
			if (target == 0) {
				return true;
			} else {
				return false;
			}
		}

		if (start - 1 >= 0 && nums[start] == 1 && nums[start - 1] % 5 == 0) {

			if (groupSum5(start + 2, nums, target)) {
				return true;
			}
			return false;
		} else {

			if (groupSum5(start + 1, nums, target - nums[start])) {
				return true;
			}

			if (nums[start] % 5 != 0 && groupSum5(start + 1, nums, target)) {
				return true;
			}
			return false;
		}
	}

	public boolean groupSumClump(int start, int[] nums, int target) {
		if (start >= nums.length) {
			if (target == 0) {
				return true;
			} else {
				return false;
			}
		}

		for (int i = 1; i < nums.length; i++) {
			if (i > 0 && nums[i - 1] == nums[i]) {
				nums[i - 1] += nums[i];
				if (i + 1 < nums.length && nums[i] != nums[i + 1]) {
					nums[i] = 0;
				} else if (i == nums.length - 1) {
					nums[i] = 0;
				}
			}
		}

		if (groupSumClump(start + 1, nums, target - nums[start])) {
			return true;
		}

		if (groupSumClump(start + 1, nums, target)) {
			return true;
		}
		return false;
	}

	public boolean splitArray(int[] nums) {
		return helper(0, nums, 0, 0);
	}

	public boolean helper(int start, int[] nums, int sum1, int sum2) {
		if (start >= nums.length) {
			return sum1 == sum2 ? true : false;
		}
		if (helper(start + 1, nums, sum1 + nums[start], sum2)) {
			return true;
		}
		if (helper(start + 1, nums, sum1, sum2 + nums[start])) {
			return true;
		}

		return false;
	}

	public boolean splitOdd10(int[] nums) {
		return helperOdd10(0, nums, 0, 0);
	}

	public boolean helperOdd10(int start, int[] nums, int sum1, int sum2) {
		if (start >= nums.length) {
			if (sum1 % 10 == 0 && sum2 % 2 == 1 || sum2 % 10 == 0 && sum1 % 2 == 1) {
				return true;
			} else {
				return false;
			}
		}
		if (helperOdd10(start + 1, nums, sum1 + nums[start], sum2)) {
			return true;
		}
		if (helperOdd10(start + 1, nums, sum1, sum2 + nums[start])) {
			return true;
		}

		return false;
	}

	public boolean split53(int[] nums) {
		return helper53(0, nums, 0, 0);
	}

	public boolean helper53(int start, int[] nums, int sum1, int sum2) {
		if (start >= nums.length) {
			return sum1 == sum2 ? true : false;
		}
		if (nums[start] % 5 == 0) {
			return helper53(start + 1, nums, sum1 + nums[start], sum2);
		}
		if (nums[start] % 3 == 0) {
			return helper53(start + 1, nums, sum1, sum2 + nums[start]);
		}
		return (helper53(start + 1, nums, sum1 + nums[start], sum2)
				|| helper53(start + 1, nums, sum1, sum2 + nums[start]));
	}

}
