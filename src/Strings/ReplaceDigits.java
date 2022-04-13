package Strings;

public class ReplaceDigits {
	public static void main(String[] args) {
System.out.println(replaceDigits("a1b2c3d4e"));
	}

	public static String replaceDigits(String s) {
		char[] ch = s.toCharArray();
		for (int i = 1; i < ch.length; i+=2) 
			ch[i]=(char)(ch[i-1]+ch[i]-'0');
			
		return String.valueOf(ch);
	}

	/**
	 * public String replaceDigits(String s) {
	var chars = s.toCharArray();
	
	for (var i = 1; i < chars.length; i += 2)
		chars[i] += chars[i - 1] - '0';
		
	return new String(chars);
}
	 */
}
