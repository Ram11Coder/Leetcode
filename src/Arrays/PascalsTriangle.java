package Arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/

public class PascalsTriangle {
	public static void main(String[] args) {
		// print(generate(20));
		// print(generate_optimal(30));
		print(generate_optimal2(30));
	}

	/**
	 * Brute force This solution not works if the numRows greater than 12
	 * 
	 * @param numRows
	 * @return
	 */
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < numRows; i++)
			result.add(new ArrayList<>());

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j <= i; j++) {
				int res = fact(i) / (fact(i - j) * fact(j));
				result.get(i).add(res);
			}
		}
		return result;
	}

	public static int fact(int n) {
		if (n <= 1)
			return 1;
		return n * fact(n - 1);
	}

	/**
	 * Reference : https://favtutor.com/blogs/pascal-triangle-cpp Solution 1
	 * 
	 * @param numRows
	 * @return
	 */
	public static List<List<Integer>> generate_optimal(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < numRows; i++)
			result.add(new ArrayList<>());

		for (int n = 0; n < numRows; n++) {
			int val = 1;
			for (int r = 0; r <= n; r++) {
				result.get(n).add(val);
				val = val * (n - r) / (r + 1);
			}
		}
		return result;
	}

	/**
	 * Solution 2
	 * 
	 * @param numRows
	 * @return
	 */
	public static List<List<Integer>> generate_optimal2(int numRows) {
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < numRows; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					list.add(1);
				else {
					int a = result.get(i - 1).get(j - 1);
					int b = result.get(i - 1).get(j);
					list.add(a + b);
				}
			}
			result.add(list);
		}
		return result;
	}

	public static void print(List<List<Integer>> list) {
		for (List<Integer> li : list)
			System.out.println(li);
	}
}
