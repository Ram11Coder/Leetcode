package Maths;

public class Reverse {
	public static void main(String[] args) {
		
		System.out.println(reverse(1234));
		System.out.println(reverse(-123));
		System.out.println(reverse(-8));
		System.out.println(reverse(1231342234));
		System.out.println(reverse(999999991));
		System.out.println(reverse(-1231342238));
		System.out.println(reverse(124000000));
		System.out.println(reverse(555555));
		System.out.println(reverse(00000000));
		System.out.println(reverse(102030405));
		System.out.println(reverse(2147483647));//Integer max
		System.out.println(reverse(-2147483647));
		System.out.println(reverse(-2147483648));//Integer min
		System.out.println(reverse(-1463847412));

	}

	public static int reverse(int x) {
		boolean ispos = true;
		if (x < 0) {
			x = -x;
			ispos = false;
		}
		long res = 0L;
		while (x > 0) {
			res = res * 10 + x % 10;
			x /= 10;
		}
		if (res > Integer.MAX_VALUE)
			return 0;

		return (ispos) ? (int) res : -(int) res;
	}
}
