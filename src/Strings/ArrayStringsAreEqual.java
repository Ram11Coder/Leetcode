package Strings;

public class ArrayStringsAreEqual {
	public static void main(String[] args) {
		// Approach 1
		System.out.println(arrayStringsAreEqual(new String[] { "ab", "c" }, new String[] { "a", "bc" }));
		System.out.println(arrayStringsAreEqual(new String[] { "a", "cb" }, new String[] { "ab", "c" }));
		System.out.println(arrayStringsAreEqual(new String[] { "abc", "d", "defg" }, new String[] { "abcddefg" }));
		System.out.println();
//Approach 2 - > String join method
		System.out.println(arrayStringsAreEqualWithJoins(new String[] { "ab", "c" }, new String[] { "a", "bc" }));
		System.out.println(arrayStringsAreEqualWithJoins(new String[] { "a", "cb" }, new String[] { "ab", "c" }));
		System.out.println(
				arrayStringsAreEqualWithJoins(new String[] { "abc", "d", "defg" }, new String[] { "abcddefg" }));
	}

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String s1 = "", s2 = "";
		for (String s : word1) {
			s1 += s;
		}

		for (String s : word2) {
			s2 += s;
		}
		if (s1.equals(s2))
			return true;
		return false;

	}

	public static boolean arrayStringsAreEqualWithJoins(String[] word1, String[] word2) {
		return (String.join("", word1).equals(String.join("", word2))) ? true : false;

	}
}
