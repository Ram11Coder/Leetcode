package Arrays;

import java.util.Arrays;

public class SumZero {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sumZero_Optimised(1)));
		System.out.println(Arrays.toString(sumZero_Optimised(2)));
		System.out.println(Arrays.toString(sumZero_Optimised(3)));
		System.out.println(Arrays.toString(sumZero_Optimised(4)));
		System.out.println(Arrays.toString(sumZero_Optimised(11)));
		System.out.println(Arrays.toString(sumZero_Optimised(20)));
		System.out.println(Arrays.toString(sumZero_Optimised(25)));
		System.out.println(Arrays.toString(sumZero_Optimised(50)));
		System.out.println(Arrays.toString(sumZero_Optimised(500)));
		System.out.println(Arrays.toString(sumZero_Optimised(1000)));
	}

//My Approach
	/**
	 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Find N
	 * Unique Integers Sum up to Zero. Memory Usage: 40.3 MB, less than 95.12% of
	 * Java online submissions for Find N Unique Integers Sum up to Zero.
	 * 
	 */
	public static int[] sumZero(int n) {
		int result[] = new int[n];
		int start = -(n / 2);
		for (int i = 0; i < n; i++)
			result[i] = start++;

		// Checking if it is a even the mid value is zero, so replacing mid value with
		// last value(start)
		if ((n & 1) != 1)
			result[n / 2] = start;

		return result;
	}

	/**
	 * (Note that any arithmetic sequence must have unique values if the common
	 * delta is non-zero)
	 * 
	 * We need the sequence sum, so that
	 * 
	 * (a[0] + a[n-1]) * n / 2 = 0, which means a[0] + a[n-1] = 0.
	 * 
	 * Note that a[n-1] - a[0] = (n-1) * delta, which is -2 * a[0],
	 * 
	 * so we simply set delta = 2, a[0] = 1 - n
	 * 
	 */
	public static int[] sumZero_Optimised(int n) {
		int result[] = new int[n];

		for (int i = 0; i < n; i++)
			result[i] = i * 2 - n + 1;

		return result;
	}

}
