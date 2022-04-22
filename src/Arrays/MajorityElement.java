package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {
	public static void main(String[] args) {
		System.out.println(majorityElementWithHashMap(new int[] { 2, 2, 1, 1, 2 }));
		System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 2 }));
	}

	
	public static int majorityElementWithHashMap(int[] nums) {
		int majority = 0, size = nums.length / 2;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
			
			if (map.get(i) > size) {
				majority = i;
				break;
			}
		}
		/*
		 * Iterator<Integer> itr = map.keySet().iterator(); while (itr.hasNext()) { int
		 * key = itr.next(); if (map.get(key) > size) { majority = key; break; } }
		 */

		return majority;
	}
	
	public static int majorityElement(int[] nums) {
		int majority = 0, size = nums.length / 2;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
		}
		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			int key = itr.next();
			if (map.get(key) > size) {
				majority = key;
				break;
			}
		}

		return majority;
	}

}
