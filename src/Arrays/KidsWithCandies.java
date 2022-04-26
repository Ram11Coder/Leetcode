package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KidsWithCandies {
	public static void main(String[] args) {
		System.out.println(kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3));
		System.out.println(kidsWithCandies(new int[] { 4, 2, 1, 1, 2 }, 1));
		System.out.println(kidsWithCandies(new int[] { 12, 1, 12 }, 10));

		System.out.println();
		System.out.println(kidsWithCandies_A1(new int[] { 2, 3, 5, 1, 3 }, 3));
		System.out.println(kidsWithCandies_A1(new int[] { 4, 2, 1, 1, 2 }, 1));
		System.out.println(kidsWithCandies_A1(new int[] { 12, 1, 12 }, 10));
		System.out.println();
		System.out.println(kidsWithCandies_Streams(new int[] { 2, 3, 5, 1, 3 }, 3));
		System.out.println(kidsWithCandies_Streams(new int[] { 4, 2, 1, 1, 2 }, 1));
		System.out.println(kidsWithCandies_Streams(new int[] { 12, 1, 12 }, 10));
	}

//Approach 1 
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> isHighCandy = new ArrayList<Boolean>();
		int max = Integer.MIN_VALUE;
		for (int candy : candies) {
			max = Math.max(max, candy);
		}

		// Optimization no need to add extra candies all time
		max = max - extraCandies;
		for (int candy : candies) {
			if (candy < max) {
				isHighCandy.add(false);
			} else {
				isHighCandy.add(true);
			}
		}

		return isHighCandy;
	}

	// Approach 1 with less code
	public static List<Boolean> kidsWithCandies_A1(int[] candies, int extraCandies) {
		int max = Integer.MIN_VALUE;
		for (int candy : candies)
			max = Math.max(max, candy);
		max -= extraCandies;
		List<Boolean> isHighCandy = new ArrayList<Boolean>();
		for (int candy : candies)
			isHighCandy.add(candy >= max);

		return isHighCandy;
	}

	// Java 8 Streams
	public static List<Boolean> kidsWithCandies_Streams(int[] candies, int extraCandies) {
		int max = Arrays.stream(candies).max().getAsInt() - extraCandies;
		return Arrays.stream(candies).mapToObj(candy -> candy >= max).collect(Collectors.toList());
	}
}
