package Strings;

public class AddBinary {
	public static void main(String[] args) {

		/*
		 * System.out.println(addBinary("10111111111", "111"));
		 * System.out.println(addBinary("1", "11"));
		 */
		System.out.println(addBinary_BruteForce("1010", "1011"));
		System.out.println(addBinary_BruteForce("110", "1110"));

		System.out.println();
		System.out.println(addBinary_Optimal("1010", "1011"));
		System.out.println(addBinary_Optimal("110", "1110"));
		/*
		 * System.out.println(addBinary_BruteForce("1111111", "110"));
		 * 
		 * System.out.println(addBinary_BruteForce("100010101", "11111"));
		 * System.out.println(addBinary_BruteForce(
		 * "100010011010101010101111111000001010100000000101011111101",
		 * "1111000000000000000001111111111101111110101111111101111111111"));
		 * System.out.println(addBinary_BruteForce("100010101",
		 * "1111111111111111111111111111111111111111111111111111"));
		 * System.out.println(addBinary_BruteForce(
		 * "10001010100000000000000000000000000000000000000000000000000000000000000000",
		 * "11111")); System.out.println(addBinary_BruteForce(
		 * "100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
		 * "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
		 * )); System.out.println(addBinary_BruteForce(
		 * "101111010101111111111111110000000000000000000000000000000000000000000001111111111111111111111111111110000000000000000011111111110010101",
		 * "111101101111111110111111111100000000000000000000000000000000000000000101010101010010111111111111111111111111111111111111111101001010101010101010101001010111111111111111"
		 * ));
		 * 
		 * System.out.println(addBinary_BruteForce(
		 * "110010101001010100101001010100101111111",
		 * "1110000000000000000000001111111111111111110000001111111111111111"));
		 */
	}

//initial approach, we can use when both binary sum will be less than Integer.MAX 
	public static String addBinary(String a, String b) {
		int sum = 0, bin = 1;
		for (int i = a.length() - 1; i >= 0; i--) {
			sum += (Character.getNumericValue(a.charAt(i)) * bin);
			bin <<= 1;
		}
		bin = 1;
		for (int i = b.length() - 1; i >= 0; i--) {
			sum += (Character.getNumericValue(b.charAt(i)) * bin);
			bin <<= 1;
		}
		String res = "";
		while (sum > 0) {
			res = (sum % 2) + res;
			sum /= 2;
		}

		return res;
	}

//My own approach
	/**
	 * Runtime: 5 ms, faster than 29.73% of Java online submissions for Add Binary.
	 * Memory Usage: 43.3 MB, less than 28.03% of Java online submissions for Add
	 * Binary.
	 */
	public static String addBinary_BruteForce(String a, String b) {
		int sum = 0, rem = 0;
		StringBuilder sb = new StringBuilder();
		int i = 0, j = 0;
		for (i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; i--, j--) {
			sum = getValue(getValue(Character.getNumericValue(a.charAt(i)), Character.getNumericValue(b.charAt(j))),
					rem);
			rem = getRem(Character.getNumericValue(a.charAt(i)), Character.getNumericValue(b.charAt(j)), rem);
			sb.append(sum);
		}
		if (i >= 0) {
			while (i >= 0) {
				sum = getValue(Character.getNumericValue(a.charAt(i)), rem);
				rem = Character.getNumericValue(a.charAt(i)) & rem;
				sb.append(sum);
				i--;
			}
		} else {
			while (j >= 0) {
				sum = getValue(Character.getNumericValue(b.charAt(j)), rem);
				rem = Character.getNumericValue(b.charAt(j)) & rem;
				sb.append(sum);
				j--;
			}
		}
		if (rem == 1)
			sb.append(rem);
		return String.valueOf(sb.reverse());
	}

	private static int getRem(int a, int b, int rem) {
		if (a == 0 && b == 0)
			return 0;
		return a & b | rem;
	}

	private static int getValue(int a, int b) {
		return (a == 1 && b == 1) ? a ^ b : a | b;
	}

	public static String addBinary_Optimal(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1, j = b.length() - 1, sum = 0;
		while (i >= 0 || j >= 0) {
			if (i >= 0)
				sum += a.charAt(i--) - '0';
			if (j >= 0)
				sum += b.charAt(j--) - '0';
			sb.append(sum % 2);
			sum /= 2;
		}
		sb.append(sum);
		return String.valueOf(sb.reverse());
	}

}
