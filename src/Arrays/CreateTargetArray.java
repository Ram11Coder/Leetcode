package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {
	public static void main(String[] args) {
		System.out
				.println(Arrays.toString(createTargetArray(new int[] { 0, 1, 2, 3, 4 }, new int[] { 0, 1, 2, 2, 1 })));
	}

	public static int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < index.length; i++) {
			list.add(index[i], nums[i]);
		}
		int res[] = new int[nums.length];
		for (int i = 0; i < list.size(); i++) {
			res[i] = list.get(i);
		}
		return res;
	}
}
