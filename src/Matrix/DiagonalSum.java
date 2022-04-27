package Matrix;

public class DiagonalSum {
	public static void main(String[] args) {
		System.out.println(diagonalSum(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
		System.out.println(diagonalSum(new int[][] { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } }));
		System.out.println(diagonalSum(new int[][] { { 5 } }));
		System.out.println();
		System.out.println(diagonalSumWithLessCode(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
		System.out.println(diagonalSumWithLessCode(new int[][] { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } }));
		System.out.println(diagonalSumWithLessCode(new int[][] { { 5 } }));
	}

	public static int diagonalSum(int[][] mat) {

		int rightDiagonalSum = 0, leftDiagonalSum = 0, n = mat.length;
		for (int i = 0, j = n - 1; i < n; i++, j--) {
			rightDiagonalSum += mat[i][i];
			leftDiagonalSum += mat[i][j];
		}

		return ((n & 1) == 0) ? rightDiagonalSum + leftDiagonalSum
				: rightDiagonalSum + leftDiagonalSum - mat[n / 2][n / 2];

	}

	public static int diagonalSumWithLessCode(int[][] mat) {
		int sum = 0, n = mat.length;
		for (int i = 0, j = n - 1; i < n; i++, j--) 
			sum += mat[i][i] + mat[i][j];
		
		return ((n & 1) == 0) ? sum : sum - mat[n / 2][n / 2];
	}
}
