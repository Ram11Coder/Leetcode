package Arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new ConcatenationOfArray().getConcatenation(new int[] {1,2,3})));
		System.out.println(Arrays.toString(new ConcatenationOfArray().getConcatenationWithInbuildFunc(new int[] {1,2,3})));
	}

	public int[] getConcatenation(int[] nums) {
		int result[] = new int[2 * nums.length];

		for (int i = 0; i < nums.length; i++) {
			result[i] = result[i + nums.length] = nums[i];
		}
		return result;
	}

	public int[] getConcatenationWithInbuildFunc(int[] nums) {
		int len1 = nums.length;
		int len2 = nums.length;
		int ans[] = new int[len1 + len2];

		System.arraycopy(nums, 0, ans, 0, len1);
		System.arraycopy(nums, 0, ans, len1, len2);
		return ans;
	}
}
