package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMatches {
	public static void main(String[] args) {
		List<List<String>> list = Arrays.asList(Arrays.asList("phone", "blue", "pixel"),
				Arrays.asList("computer", "silver", "phone"), Arrays.asList("phone", "gold", "iphone"));
		System.out.println(countMatchesWithEfficient(list, "type", "phone"));
		System.out.println(countMatches(list, "color", "silver"));

	}

	public static int countMatchesWithEfficient(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;

		for (List<String> list : items) {
			if (ruleKey.equals("type") && ruleValue.equals(list.get(0)))
				count++;
			if (ruleKey.equals("color") && ruleValue.equals(list.get(1)))
				count++;
			if (ruleKey.equals("name") && ruleValue.equals(list.get(2)))
				count++;
		}
		return count;
	}

	//Bruteforce approach
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
