package Arrays;

import java.util.Arrays;

public class Shuffle {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(shuffle(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4)));
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] result = new int[nums.length];
		for (int i = 0, j = 0; i < n; i++) {
			result[j++] = nums[i];
			result[j++] = nums[i + n];
		}
		return result;
	}
}
