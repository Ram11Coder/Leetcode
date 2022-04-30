package Arrays;

public class FirstPalindrome {
	public static void main(String[] args) {
		System.out.println(firstPalindrome(new String[] {"abc","car","ada","racecar","cool" }));
		System.out.println(firstPalindrome(new String[] {"def","ghi"}));
	}

	public static String firstPalindrome(String[] words) {
		for (String word : words)
			if (isPalindrome(word))
				return word;
		return "";
	}

	private static boolean isPalindrome(String word) {
		for (int i = 0, j = word.length() - 1; i < j; i++, j--)
			if (word.charAt(i) != word.charAt(j))
				return false;

		return true;
	}
}
