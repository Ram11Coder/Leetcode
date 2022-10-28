package Maths;

/**
 * reference :
 * https://www.geeksforgeeks.org/find-whether-given-integer-power-3-not/
 * 
 *
 */
public class PowerOfThree {
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(33));
		System.out.println(isPowerOfThree(1));
		System.out.println(isPowerOfThree(27));
		System.out.println(isPowerOfThree(1162261467));
		System.out.println(isPowerOfThree(81));
		System.out.println(isPowerOfThree(348678440));
		System.out.println(isPowerOfThree(387420489));

	}

	public static boolean isPowerOfThree(int n) {
		if (n < 3 || n % 3 != 0)
			return false;

		while (n > 3) {
			n /= 3;
			if (n % 3 != 0)
				return false;
		}
		return true;
	}

	public static boolean isPowerOfThree_optimal1(int n) {
		double d = Math.log10(n) / Math.log10(3);
		if (d - (int) d == 0)
			return true;
		return false;
	}

}
