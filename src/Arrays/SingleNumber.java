package Arrays;

public class SingleNumber {
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] { 4,1,2,1,2 }));
		System.out.println(singleNumberWithNoExtraVariable(new int[] { 4,1,2,1,2 }));
	}

	public static int singleNumber(int[] nums) {
		int res =0;
		for (int i :nums) 
			res ^= i;
	return res;
	}
	
	public static int singleNumberWithNoExtraVariable(int[] nums) {
		  for(int i=0;i<nums.length-1;i++){
		    nums[i+1] ^= nums[i];
		  }
		  return nums[nums.length-1];
		}
}
