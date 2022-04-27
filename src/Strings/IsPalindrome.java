package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://leetcode.com/problems/valid-palindrome/
public class IsPalindrome {
	public static void main(String[] args) {

		System.out.println(isPalindromeUsingPattern("A man, a plan, a canal: Panama"));
		System.out.println(isPalindromeUsingPattern("race a car"));
		System.out.println(isPalindromeUsingPattern("ab_a"));
		System.out.println();
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome("ab_a"));
		System.out.println();

		System.out.println(isPalindromeBetterApproach("A man, a plan, a canal: Panama"));
		System.out.println(isPalindromeBetterApproach("race a car"));
		System.out.println(isPalindromeBetterApproach("ab_a"));
		System.out.println();
	}

	public static boolean isPalindromeUsingPattern(String s) {

		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]+");
		Matcher match = pattern.matcher(s);
		String word = match.replaceAll("").toLowerCase();
		int i = 0, j = word.length() - 1;
		while (i < j) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}

		return true;

	}

	// 1043 ms
	public static boolean isPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;

			i++;
			j--;
		}

		return true;

	}

	public static boolean isPalindromeBetterApproach(String s) {
		s = s.toLowerCase();
		for (int i = 0, j = s.length() - 1; i < j;) {
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			} else if (!Character.isLetterOrDigit(s.charAt(j))) {
				j--;
			} else if (s.charAt(i++) != s.charAt(j--))
				return false;
		}

		return true;

	}

}