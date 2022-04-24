package Arrays;

public class MaxProfit {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 }));
		System.out.println(maxProfit(new int[] { 2, 4, 1 }));
		System.out.println();

		System.out.println(bruteforce(new int[] { 7, 1, 5, 3, 6, 4 }));
		System.out.println(bruteforce(new int[] { 7, 6, 4, 3, 1 }));
		System.out.println(bruteforce(new int[] { 2, 4 ,1}));
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
		/*
		 * int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, minIndex, maxIndex;
		 * 
		 * for (int i = 0; i < prices.length; i++) { if (max < prices[i]) { max =
		 * prices[i]; maxIndex = i; } else { min = prices[i]; minIndex = i; } }
		 */
		/*
		 * if(minIndex<maxIndex) {
		 * 
		 * }
		 */
		int i = 0, j = prices.length - 1, max_value = 0;
		while (i < j) {
			int priceValue = prices[j] - prices[i];
			if (priceValue > max_value) {
				max_value = priceValue;
	
			}
			
			if (prices[i] > prices[i + 1]) {
				i++;
			}else
				j--;

			if (prices[j - 1] > prices[j]) {
				j--;
			}else
				i++;
		}

		return max_value;

	}
}
