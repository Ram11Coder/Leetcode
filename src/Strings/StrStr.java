package Strings;

public class StrStr {
	public static void main(String[] args) {
		System.out.println(strStr("hello", "lol"));
	}

	private static int strStr(String haystack, String needle) {

		return haystack.indexOf(needle);
	}
}
