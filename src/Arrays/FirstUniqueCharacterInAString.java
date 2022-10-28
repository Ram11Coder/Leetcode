package Arrays;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode"));
	}

	public static int firstUniqChar(String s) {
		int freq[] = new int[26];
		for (int i = 0; i < s.length(); i++)
			freq[s.charAt(i) - 'a']++;

		for (int i = 0; i < s.length(); i++)
			if (freq[s.charAt(i) - 'a'] == 1)
				return i;

		return -1;
	}

	public int firstUniqChar_Map(String s) {
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		int n = s.length();
		// build hash map : character and how often it appears
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			count.put(c, count.getOrDefault(c, 0) + 1);
		}

		// find the index
		for (int i = 0; i < n; i++) {
			if (count.get(s.charAt(i)) == 1)
				return i;
		}
		return -1;
	}
}
