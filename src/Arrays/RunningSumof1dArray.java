package Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumof1dArray {
	public static void main(String[] args) {
		int[] values = new RunningSumof1dArray().runningSumWithoutExtraVar(new int[] { 1, 2, 3, 4, 5 });
		System.out.println(Arrays.toString(values));
	}

	public int[] runningSum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sum += nums[i];
		}

		return nums;

	}

	// Another approach without extra variable
	public int[] runningSumWithoutExtraVar(int[] nums) {

		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] + nums[i - 1];
		}

		return nums;

	}
}
