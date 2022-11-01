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
		while (n >= 3) {
			if (n % 3 != 0)
				return false;
			n /= 3;
		}
		return n == 1;
	}

	public static boolean isPowerOfThree_optimal1(int n) {
		double d = Math.log10(n) / Math.log10(3);
		if (d - (int) d == 0)
			return true;
		return false;
	}

	public static boolean isPowerOfThree_optimal2(int n) {
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}

	public static boolean isPowerOfThree_optimal3(int n) {
		// 3^19 =1162261467,
		// 3^20 is exceding Integer_Range So 3^19 is the highest power in Integer Rang
		return (n > 0 && 1162261467 % n == 0);
	}
}
