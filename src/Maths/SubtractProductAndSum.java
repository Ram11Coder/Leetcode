package Maths;

public class SubtractProductAndSum {
	public static void main(String[] args) {
		System.out.println(subtractProductAndSum(234));
		System.out.println(subtractProductAndSum(4421));
		
	}

	public static int subtractProductAndSum(int n) {

		int sum = 0, mul = 1;
		while (n > 0) {
			sum += (n % 10);
			mul *= (n % 10);
			n/=10;
		}
		
		return mul-sum;
	}
}
