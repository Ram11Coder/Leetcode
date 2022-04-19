package Strings;

import java.util.ArrayList;
import java.util.List;

public class CountMatches {
	public static void main(String[] args) {
		List<List<String>>
System.out.println(countMatches(,"type", "phone"));
	}

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;

		switch (ruleKey) {
		case "type":
			count = checkByType(items, ruleValue, count);
			break;
		case "color":
			count = checkByColor(items, ruleValue, count);
			break;
		case "name":
			count = checkByName(items, ruleValue, count);
			break;

		}
		return count;
	}

	private static int checkByName(List<List<String>> items, String ruleValue, int count) {
		for (List<String> list : items) {
			if (list.get(2).equals(ruleValue)) {
				count++;
			}
		}
		return count;
	}

	private static int checkByColor(List<List<String>> items, String ruleValue, int count) {
		for (List<String> list : items) {
			if (list.get(1).equals(ruleValue)) {
				count++;
			}
		}
		return count;
	}

	private static int checkByType(List<List<String>> items, String ruleValue, int count) {

		for (List<String> list : items) {
			if (list.get(0).equals(ruleValue)) {
				count++;
			}
		}
		return count;

	}
}
