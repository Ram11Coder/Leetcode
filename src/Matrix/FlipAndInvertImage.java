package Matrix;

import java.util.Arrays;

public class FlipAndInvertImage {

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
	}

	public static int[][] flipAndInvertImage(int[][] image) {

		for (int[] imgs : image) 
			reverseAndToggle(imgs);
			//toggle(imgs);
		
		return image;

	}

	private static void reverseAndToggle(int[] imgs) {
		int i = 0, j = imgs.length-1 ;
		while (i <= j) {
			int temp = imgs[i];
			imgs[i] = imgs[j]^1;
			imgs[j] = temp^1;
			i++;
			j--;
		}
	}
	

	private static void toggle(int[] imgs) {
		for (int i = 0; i < imgs.length; i++) {
			imgs[i] ^= 1;
		}

	}

}
