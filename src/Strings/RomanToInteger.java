package Strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public static void main(String[] args) {

		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));
		System.out.println(romanToInt("MDCXCV"));
		System.out.println();
		System.out.println(romanToInt_optimised("III"));
		System.out.println(romanToInt_optimised("LVIII"));
		System.out.println(romanToInt_optimised("MCMXCIV"));
		System.out.println(romanToInt_optimised("MDCXCV"));
	}

//My solution - 5 ms
	public static int romanToInt(String s) {

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int sum = 0, i = 0;
		for (i = 0; i < s.length() - 1;) {
			int start = map.get(s.charAt(i));
			int end = map.get(s.charAt(i + 1));
			if (start < end) {
				sum += (end - start);
				i += 2;
			} else {
				sum += start;
				i++;
			}
		}
		if (i < s.length())
			sum += map.get(s.charAt(s.length() - 1));
		return sum;
	}

	// Optimised - 3ms
	public static int romanToInt_optimised(String s) {

		int answer = 0, number = 0, prev = 0;

		for (int j = s.length() - 1; j >= 0; j--) {
			switch (s.charAt(j)) {
			case 'M' -> number = 1000;
			case 'D' -> number = 500;
			case 'C' -> number = 100;
			case 'L' -> number = 50;
			case 'X' -> number = 10;
			case 'V' -> number = 5;
			case 'I' -> number = 1;
			}
			if (number < prev)
				answer -= number;
			else
				answer += number;

			prev = number;
		}
		return answer;
	}
}
