package HashTable;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(isHappy(19));
		System.out.println(isHappy(2));
		System.out.println(isHappy(21));
		System.out.println(isHappy(2242));
		System.out.println(isHappy(1111111));

	}

	/**
	 * 
	 * A happy number is a number defined by the following process:
	 * 
	 * Starting with any positive integer, replace the number by the sum of the
	 * squares of its digits. Repeat the process until the number equals 1 (where it
	 * will stay), or it loops endlessly in a cycle which does not include 1. Those
	 * numbers for which this process ends in 1 are happy.
	 * 
	 * If same number return more than once then that is not a happy number
	 * 
	 * i
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isHappy(int n) {
		int sqrt[] = new int[10];
		for (int i = 1; i < sqrt.length; i++)
			sqrt[i] = i * i;

		Set<Integer> set = new HashSet<>();
		int temp = n;
		while (true) {
			int sum = 0;
			while (temp > 0) {
				sum += sqrt[temp % 10];
				temp /= 10;
			}
			if (set.contains(sum))
				return false;
			else
				set.add(sum);
			if (sum == 1)
				return true;

			temp = sum;
		}
	}
}
