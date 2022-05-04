package Strings;

public class MyAtoi{
	public static void main(String[] args) {
		System.out.println(myAtoi_solution("  -42"));
		System.out.println(myAtoi_solution("42"));
		System.out.println(myAtoi_solution("4193 with words"));
		System.out.println(myAtoi_solution("words and 987"));
		System.out.println(myAtoi_solution("-91283472332"));
		System.out.println(myAtoi_solution("+91283"));
		System.out.println(myAtoi_solution(".1"));
		System.out.println(myAtoi_solution("10.1"));
		System.out.println(myAtoi_solution("-10.1"));
		System.out.println(myAtoi_solution("0"));
		System.out.println(myAtoi_solution("0.12312"));
		System.out.println(myAtoi_solution("adsf 123"));
		System.out.println(myAtoi_solution("1 dfsd123"));
		System.out.println(myAtoi_solution("+-12"));
		System.out.println(myAtoi_solution("-"));
		System.out.println(myAtoi_solution("+"));
		System.out.println(myAtoi_solution("+1"));
		System.out.println(myAtoi_solution(
				"-912834723237777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777748323649876234876234987623874623462378462837468723462"));
		System.out.println(myAtoi_solution(
				"99128347232377777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777481283472332239847238478923749823749823749872389478923748971234872384971237894"));
	}
//Faced some exception based on handle the below code
	public static int myAtoi(String s) {
		s = s.trim();
		int start = 0;
		String res = "";
		if (s.isBlank() || Character.isAlphabetic(s.charAt(0)) || s.charAt(0) == '.')
			return 0;
		else if (s.length() >= 1 && s.charAt(0) == '-' || s.charAt(0) == '+') {
			res += s.charAt(0);
			start = 1;
		}

		for (int i = start; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))
				res += s.charAt(i);
			else
				break;
			if (Long.valueOf(res) > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			else if (Long.valueOf(res) < Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
		}
		if (res.length() == 1 && !Character.isDigit(res.charAt(0)))
			return 0;
		return Integer.valueOf(res);
	}

	
	// Optimised version of code
	public static int myAtoi_solution(String str) {
		str = str.trim();
		if (str.isEmpty())
			return 0;
		int sign = 1;
		int i = 0;
		if (str.charAt(0) == '-' || str.charAt(0) == '+') {
			sign = (str.charAt(0) == '-') ? -1 : 1;
			if (str.length() < 2 || !Character.isDigit(str.charAt(1))) {
				return 0;
			}
			i++;
		}
		int n = 0;
		while (i < str.length()) {
			if (Character.isDigit(str.charAt(i))) {
				int d = str.charAt(i) - '0';
				if (n > (Integer.MAX_VALUE - d) / 10) { // Detect the integer overflow.
					n = (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
					return n;
				}
				n = n * 10 + d;
			} else {
				break;
			}
			i++;
		}
		return sign * n;
	}
}
