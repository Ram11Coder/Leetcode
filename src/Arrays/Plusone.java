package Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/plus-one/
public class Plusone {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Plusone().plusOne(new int[] {9,9,9,9})));
	}

	public int[] plusOne(int[] digits) {
		int sum = 1, rem = 0;
		for (int i = digits.length - 1,temp = digits[i]; i >= 0; i--) {
			if (sum + digits[i] + rem > 9) {
				digits[i] = (sum + digits[i] + rem) % 10;
				rem = (sum + temp + rem) / 10;
				sum = 0;
			} else {
				digits[i] = digits[i] + sum + rem;
				rem=0;
				break;
			}
		}

		return (rem > 0) ? remainderArray(digits, rem) : digits;

	}

	private int[] remainderArray(int[] digits, int rem) {
		int result[] = new int[digits.length + 1];
		result[0] = rem;
		for (int i = 1; i < result.length; i++) {
			result[i] = digits[i - 1];
		}
		return result;
	}
}
