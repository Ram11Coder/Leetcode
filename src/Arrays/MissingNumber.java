package Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int[] nums = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingNumber(nums));
	}
//My solution 

	public static int missingNumber(int[] nums) {
		int total = (nums.length * (nums.length + 1)) / 2;
		for (int i : nums) {
			total -= i;
		}
		return total;

	}
/**
 * Xor Approach
 * 0 ^ 0 = 0
 * 0 ^ 1 = 1 
 * ex: b^a^b =>  a
 *  nums => [0,1,3] 
 *  missing value -> 2
 *  
 *  res =3(array length)
 *  possible index [0,1,2]
 *  values are [0,1,3]
 *  res = 3
 * 3^0^0^1^1^2^3^
 *  final value -> 2
 * 
 * @param nums
 * @return
 */
	public int missingNumber_xor(int[] nums) {
		int res = nums.length;
		for (int i = 0; i < nums.length; i++) 
			res = res ^ i ^ nums[i];
		
		return res;
	}
}
