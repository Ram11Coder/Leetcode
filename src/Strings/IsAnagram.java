package Strings;

public class IsAnagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram"));
	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		int freq[] = new int[26];
		for (char c : s.toCharArray())
			freq[c - 'a']++;

		for (char c : t.toCharArray()) {
			if (freq[c - 'a'] > 0)
				freq[c - 'a']--;
			else
				return false;
		}
		return true;
	}
}