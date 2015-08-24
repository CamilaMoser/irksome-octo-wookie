/*
 * 
 */
package pucrs.lapro3lm.ordenacao;

import java.util.Arrays;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
public class SortingMethods {

	/**
	 * 
	 * @param a
	 */
	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a.length - 1; j++)
				if (a[j] > a[j + 1])
					swap(a, j, j + 1);
	}

	/**
	 * 
	 * @param a
	 * @param i
	 * @param j
	 */
	private static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] tst = { 1, 2, 3, 7, 6, 5 };
		System.out.println(Arrays.toString(tst));
		SortingMethods.bubbleSort(tst);
		System.out.println(Arrays.toString(tst));
	}

}
