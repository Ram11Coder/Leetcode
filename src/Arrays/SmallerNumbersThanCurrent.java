package Arrays;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] { 8,0,0, 1, 2, 2, 3 })));
	}

//BruteForce -O(n^2)
	public static int[] bruteForce(int[] nums) {

		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] > nums[j])
					count++;
			}
			result[i] = count;
		}
		return result;
	}

	// Time complexity - O(n)
	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int bucket[] = new int[102];
		for (int i : nums)
			bucket[i + 1]++;

		for (int i = 1; i < bucket.length; i++)
			bucket[i] += bucket[i - 1];

		for (int i = 0; i < nums.length; i++)
			nums[i] = bucket[nums[i]];

		return nums;
	}
}
