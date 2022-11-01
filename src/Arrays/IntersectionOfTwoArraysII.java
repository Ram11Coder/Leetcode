package Arrays;
//https://leetcode.com/problems/intersection-of-two-arrays-ii/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(intersect(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 })));
		//System.out.println(Arrays.toString(intersect(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 })));
		//System.out.println(Arrays.toString(intersect_Additional(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 })));
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		int freq[] = new int[1001];
		for (int i : nums1)
			freq[i]++;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums2.length; i++) {
			if (freq[nums2[i]] > 0) {
				list.add(nums2[i]);
				freq[nums2[i]]--;
			}
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
	
	public static int[] intersect_Additional(int[] nums1, int[] nums2) {
	    Arrays.sort(nums1);
	    Arrays.sort(nums2);
	    int i=0,j=0,k=0;
	    while(i<nums1.length && j<nums2.length){
	        if(nums1[i]==nums2[j]){
	            nums1[k++] = nums1[i];
	            i++;j++;
	        }
	        else if(nums1[i]>nums2[j])
	            j++;
	        else
	            i++;
	    }
	    return Arrays.copyOfRange(nums1,0,k);
	}
	
}
