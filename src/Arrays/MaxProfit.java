package Arrays;

public class MaxProfit {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 }));
		System.out.println(maxProfit(new int[] { 2, 4, 1 }));
		System.out.println();

		System.out.println(bruteforce(new int[] { 7, 1, 5, 3, 6, 4 }));
		System.out.println(bruteforce(new int[] { 7, 6, 4, 3, 1 }));
		System.out.println(bruteforce(new int[] { 2, 4, 1 }));
		
		System.out.println();

		System.out.println(maxProfit_Improved(new int[] { 7, 1, 5, 3, 6, 4 }));
		System.out.println(maxProfit_Improved(new int[] { 7, 6, 4, 3, 1 }));
		System.out.println(maxProfit_Improved(new int[] { 2, 4, 1 }));
		
		
	}

	public static int bruteforce(int[] prices) {
		int sum = 0;
		for (int i = 0; i < prices.length; i++) {

			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] - prices[i] > sum) {
					sum = prices[j] - prices[i];
				}
			}
		}
		return sum;
	}

	public static int maxProfit(int[] prices) {
		int sell = 0, buy = Integer.MAX_VALUE, profit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < buy)
				buy = prices[i];
			sell = prices[i] - buy;
			if (profit < sell)
				profit = sell;
		}

		return profit;
	}

	public static int maxProfit_Improved(int[] prices) {
		int sell = 0, buy = Integer.MAX_VALUE, profit = 0;

		for (int i = 0; i < prices.length; i++) {
			buy = Math.min(prices[i], buy);
			sell = prices[i] - buy;
			profit = Math.max(profit, sell);
		}
		return profit;
	}
}
