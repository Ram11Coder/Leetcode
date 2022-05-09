package Recursion;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {

		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		System.out.println(Arrays.toString(s));
		reverseString(s);
		System.out.println(Arrays.toString(s));
	}

	public static void reverseString(char[] s) {
		reverse(s, 0, s.length - 1);
	}

	private static void reverse(char[] str, int start, int end) {
		if (start >= end) {
			return;
		}
		swap(str, start, end);
		reverse(str, start + 1, end - 1);
	}

	private static void swap(char[] str, int start, int end) {
		char t = str[start];
		str[start] = str[end];
		str[end] = t;
	}
}
