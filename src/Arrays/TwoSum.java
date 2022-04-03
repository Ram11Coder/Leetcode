package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {

		// System.out.println(Arrays.toString((new TwoSum().twoSum(new int[] { 3, 3 },
		// 6))));
		System.out.println(Arrays.toString((new TwoSum().twoSumUsingHashMap(new int[] { 2, 7, 5, 3, 4, 3 }, 7))));
	}

	public int[] twoSum(int[] nums, int target) {

		int result[] = new int[2];
		loop: for (int i = 0; i < nums.length - 1; i++) {
			int sum = nums[i];
			result[0] = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (sum + nums[j] == target) {
					result[1] = j;
					break loop;
				}
			}
		}
		return result;
	}

	// using hashmap

	public int[] twoSumUsingHashMap(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		// int result[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i]))
				return new int[] { map.get(target - nums[i]), i };
			else
				map.put(nums[i], i);
		}
		return new int[] { -1, -1 };
	}
}