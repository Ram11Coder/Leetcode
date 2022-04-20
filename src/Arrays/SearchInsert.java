package Arrays;

public class SearchInsert {
	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] { 1, 3, 5, 7 }, 6));
	}

	public static int searchInsert(int[] nums, int target) {
		int start = 0, end = nums.length-1;
		while (start <= end) {
			int max = (start + end) / 2;
			if (nums[max] == target)
				return max;
			if (nums[max] < target)
				start = max+1 ;
			else
				end = max-1;
		}

		return start;
	}
}
