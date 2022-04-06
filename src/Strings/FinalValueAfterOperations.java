package Strings;

import java.util.Arrays;

public class FinalValueAfterOperations {

	public static void main(String[] args) {
		/*
		 * System.out.println( new
		 * FinalValueAfterOperations().finalValueAfterOperations(new String[] { "++X",
		 * "++X", "X++" }));
		 */
		System.out.println(
				new FinalValueAfterOperations().finalValueAfterOperationsJava8(new String[] { "++X", "++X", "X++" }));
	}

	public int finalValueAfterOperations(String[] operations) {
		int x = 0;
		for (String s : operations)
			if (s.charAt(1) == '+')
				x++;
			else
				x--;

		return x;
	}

//Char[1] -> whether (+/-) only present
	public int finalValueAfterOperationsJava8(String[] operations) {
		return Arrays.stream(operations, 0, operations.length)
				.mapToInt(operation -> operation.charAt(1) == '+' ? 1 : -1).sum();
	}
}
