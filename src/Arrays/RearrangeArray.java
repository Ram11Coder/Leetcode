package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(rearrangeArray(new int[] { 3, 1, -2, -5, 2, -4 })));
		System.out.println(Arrays.toString(rearrangeArray(new int[] { -1, 1 })));
		System.out.println(Arrays.toString(rearrangeArray(new int[] { 1, 2, 3, -2, -1, -1 })));
	}

// Extra memory
	public static int[] rearrangeArrayWithExtraMemory(int[] nums) {
		List<Integer> posArr = new ArrayList<Integer>();
		List<Integer> negArr = new ArrayList<Integer>();
		for (int i : nums)
			if (i > 0)
				posArr.add(i);
			else
				negArr.add(i);

		for (int i = 0, j = 0; i < nums.length; i += 2, j++) {
			nums[i] = posArr.get(j);
			nums[i + 1] = negArr.get(j);
		}
		return nums;
	}

	public static int[] rearrangeArray(int[] nums) {
		int[] result = new int[nums.length];
		int odd = 1, even = 0;
		for (int i : nums)
			if (i > 0) {
				result[even] = i;
				even += 2;
			} else {
				result[odd] = i;
				odd += 2;
			}
		return result;
	}
}
