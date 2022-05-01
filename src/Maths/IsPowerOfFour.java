package Maths;

public class IsPowerOfFour {
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(16));
		System.out.println(isPowerOfFour(5));
		System.out.println(isPowerOfFour(1));
		System.out.println(isPowerOfFour(124));
		System.out.println(isPowerOfFour(1024));
		System.out.println(isPowerOfFour(2048));
		System.out.println(isPowerOfFour(4096));
		System.out.println(isPowerOfFour(Integer.MAX_VALUE));
		System.out.println(isPowerOfFour(Integer.MIN_VALUE));
		System.out.println(isPowerOfFour(-64));
		System.out.println(isPowerOfFour(1));
		System.out.println(isPowerOfFour(2));
		System.out.println(isPowerOfFour(-3));
		System.out.println(isPowerOfFour(-76));

	}

	/*
	 * Runtime:2 ms,
	 * 
	 * faster than 47.75% of Java online submissions for Power of Four. Memory
	 * Usage:41.5 MB, less than 37.74% of Java online submissions for Power of Four
	 */

	public static boolean isPowerOfFour(int n) {
		if (n == 1)
			return true;
		else if (n % 4 == 0 && pof(n))
			return true;
		return false;
	}

	private static boolean pof(int n) {
		while (n > 3 && n % 4 == 0) {
			if (n == 4) {
				return true;
			}
			n /= 4;
		}
		return false;
	}
	//Bit manipulation
	
	
	
	/* log approach 
	 * 
	 * Consider if n is power of 4. 4^x = n x * log 4 = log n x = (log n) / log 4
	 * So, if x is a whole number then it's modulo will be zero.
	 */

	    public boolean isPowerOfFour_log(int n) {
	        if(n <= 0)
	            return false;
	        return (Math.log(n)/Math.log(4)) % 1 == 0;
	    }
	//return (num & (num - 1)) == 0 && num % 3 == 1;
	    //return num > 0 && (num & (num - 1)) ==0  && (num & 0x55555555) !=0;
	    
	    public boolean isPowerOfFour_Recursion(int n) {
	        
	        if(n == 0) return false;
	        if(n == 1) return true;
	        
	        if(n % 4 != 0) return false;
	        
	        return isPowerOfFour(n/4);    
	    }
	    
}
