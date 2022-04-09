package Maths;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(new Palindrome().isPalindrome(121));
	}
	public boolean isPalindrome(int x) {
		if(x<0) {
			return false ;
		}
	if(reverse(x)==x) {
		return true;
	}
	    return false;
	}
	private int reverse(int x) {
		int rev=0,pow=10;
	while(x>0) {
			rev=rev*pow+x%10;
			x/=10;
		}
		return rev;
	}
	
}

