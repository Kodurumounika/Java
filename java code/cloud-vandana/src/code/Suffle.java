package code;

import java.util.Random;

public class Suffle {
	public static void suff(int[] arr) {
		Random r = new Random();
		for (int i = arr.length - 1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		suff(a);

	}

}
