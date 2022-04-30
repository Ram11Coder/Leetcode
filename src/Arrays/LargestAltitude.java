package Arrays;

public class LargestAltitude {
	public static void main(String[] args) {
		System.out.println(largestAltitude(new int[] { -5, 1, 5, 0, -7 }));
		System.out.println(largestAltitude(new int[] { -4, -3, -2, -1, 4, 3, 2 }));
		System.out.println(largestAltitude(new int[] { -4, 3, 2, -1, 8, 2, 2 }));
	}

	public static int largestAltitude(int[] gain) {

		int prev = 0, max = 0;
		for (int i : gain) {
			max=Math.max(prev+i, max);
			/*
			 * if (prev + i > max) max = prev + i;
			 */
			prev += i;
		}

		return max;
	}
}
