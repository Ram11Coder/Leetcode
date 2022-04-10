package Strings;

import java.util.HashMap;
import java.util.Map;

public class JewelsandStones {
	public static void main(String[] args) {
System.out.println(new JewelsandStones().numJewelsInStones("aA",  "aAAbbbb"));
System.out.println(new JewelsandStones().numJewelsInStonesTest("aA",  "aAAbbbb"));
}

	public int numJewelsInStones(String jewels, String stones) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : stones.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		int count=0;
		for(char c :jewels.toCharArray())
			if(map.containsKey(c))
			count+=map.get(c);
		return count;

	}
	
	/*
	 * public static int numJewelsInStonesTest(String J, String S) { int res=0;
	 * for(char c : S.toCharArray()){ if(J.indexOf(c) != -1){ res++; } } return res;
	 * }
	 */
	public int numJewelsInStonesTest(String J, String S) {
	    return S.replaceAll("[^" + J + "]", "").length();
	}

}
