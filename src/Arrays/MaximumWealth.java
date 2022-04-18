package Arrays;

import java.util.Arrays;

public class MaximumWealth {
	public static void main(String[] args) {
		System.out.println(maximumWealth(new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } }));
		System.out.println(maximumWealthWithLoopAndStream(new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } }));
		System.out.println(maximumWealthWithStream(new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } }));
	}

	public static int maximumWealth(int[][] accounts) {
		int maxsize = 0;
		for (int[] account : accounts) {
			int sum = 0;
			for (int acc : account) {
				sum += acc;
			}
			maxsize = Math.max(sum, maxsize);
		}

		return maxsize;
	}

	public static int maximumWealthWithLoopAndStream(int[][] accounts) {
		int maxsize = 0;
		for (int[] account : accounts)
			maxsize = Math.max(maxsize, Arrays.stream(account).sum());

		return maxsize;
	}

	public static int maximumWealthWithStream(int[][] accounts) {
		return Arrays.stream(accounts).mapToInt(acc -> Arrays.stream(acc).sum()).max().getAsInt();
	}
}
