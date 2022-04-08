package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Panagram {
	public static void main(String[] args) {
		System.out.println(new Panagram().checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
	}

	public boolean checkIfPangram(String sentence) {
		if (sentence.length() < 26)
			return false;

		int alphabets[] = new int[26];
		for (char c : sentence.toCharArray())
			alphabets[c - 97]++;

		for (int values : alphabets)
			if (values == 0)
				return false;

		return true;
	}

	public boolean checkIfPangramWithMap(String sentence) {
		if (sentence.length() < 26)
			return false;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : sentence.toCharArray())
			map.put(c, (map.containsKey(c) ? (map.get(c) + 1) : 1));

		int count = 0;
		for (Character c : map.keySet())
			if (map.containsKey(c))
				count++;

		if (count < 26)
			return false;
		return true;
	}

}
