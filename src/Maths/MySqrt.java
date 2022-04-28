package Maths;
//https://leetcode.com/problems/sqrtx/discuss/25057/3-4-short-lines-Integer-Newton-Every-Language

public class MySqrt {

	// https://leetcode.com/problems/sqrtx/
	public static void main(String[] args) {
		/*
		 * System.out.println(mySqrt_Better(2)); System.out.println(mySqrt_Better(4));
		 * System.out.println(mySqrt_Better(8)); System.out.println(mySqrt_Better(1));
		 * System.out.println(mySqrt_Better(1_999_999_999));
		 * System.out.println(mySqrt_Better(1_000000000));
		 * System.out.println(mySqrt_Better(2_000000000));
		 * System.out.println(mySqrt_Better(2147483647));
		 * System.out.println(mySqrt_Better(32));
		 */
		System.out.println();
		System.out.println(mySqrt_BinarySearch(2));
		System.out.println(mySqrt_BinarySearch(4));
		System.out.println(mySqrt_BinarySearch(36));
		System.out.println(mySqrt_BinarySearch(1_999_999_999));
		System.out.println(mySqrt_BinarySearch(2_000000000));
		System.out.println(mySqrt_BinarySearch(2147483647));
		System.out.println(mySqrt_BinarySearch(32));
		System.out.println();
		System.out.println(mySqrt_NewtonMethod(2));
		System.out.println(mySqrt_NewtonMethod(4));
		System.out.println(mySqrt_NewtonMethod(36));
		System.out.println(mySqrt_NewtonMethod(1_999_999_999));
		System.out.println(mySqrt_NewtonMethod(2_000000000));
		System.out.println(mySqrt_NewtonMethod(2147483647));
		System.out.println(mySqrt_NewtonMethod(32));
	}

//Bruteforce - 32ms
	public static int mySqrt(int x) {
		int i = 0;
		for (i = 1; i * i <= x && (i * i > 0); i++)
			;
		return (i * i == x) ? i : i - 1;
	}

	public static int mySqrt_Inbuilt(int x) {
		return (int) Math.sqrt(x);
	}

	public static int mySqrt_NewtonMethod(int x) {
		long r = x;
		while (r > x / r)
			r = (r + x / r) / 2;
		return (int) r;
	}

//Binary search - O(log(n)) -1ms
	public static int mySqrt_BinarySearch(int x) {
		if (x == 0 || x == 1)
			return x;
		int left = 0, right = x;
		while (left < right) {
			int mid = left + (right - left) / 2;

			if (mid > x / mid) {
				right = mid - 1;
			} else {
				left = mid + 1;

				if (left > x / left) {
					return mid;
				}
			}
			// System.out.println("Left - " + left + ", Right - " + right);
		}
		return left;

	}
}
