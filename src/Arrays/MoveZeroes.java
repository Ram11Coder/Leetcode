package Arrays;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {

		int[] nums = new int[] { 0, 1, 0, 7, 23, 231, 1, 1, 1, 5, 4, 3, 2, 3, 12 };
		moveZeroes_snowBall(nums);
	}

	public static void moveZeroes(int[] nums) {
		int res[] = new int[nums.length];

		for (int i = 0, j = 0; i < nums.length; i++) {
			if (nums[i] != 0)
				res[j++] = nums[i];
		}

		System.out.println(Arrays.toString(res));
	}

	public static void moveZeroes_WithOutExtraSpace(int[] nums) {

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0)
				nums[j++] = nums[i];
		}
		while (j < nums.length) {
			nums[j] = 0;
			j++;
		}

		System.out.println(Arrays.toString(nums));
	}

	public static void moveZeroes_snowBall(int[] nums) {
		int snowBall = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				snowBall++;
			} else if (snowBall > 0) {
				int t = nums[i];
				nums[i] = 0;
				nums[i - snowBall] = t;
			}
		}

		System.out.println(Arrays.toString(nums));
	}

}
