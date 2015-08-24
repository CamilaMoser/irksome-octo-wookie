/*
 * 
 */
package pucrs.alpro3lm.ordenacao;

import java.util.Arrays;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
public class SortingMethods {

	private static long z;

	public static void insertionSort(int[] a) {
		z+= 3;
		for (int j = 1; j < a.length; j++) {
			int i = j - 1;
			int key = a[j];
			z+= 15;
			while ((i >= 0) && (a[i] > key)) {
				z += 10;
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = key;
		}

	}

	/**
	 * 
	 * @param a
	 */
	public static void bubbleSort(int[] a) {
		z += 3;
		for (int i = 0; i < a.length; i++) {
			z += 8;
			for (int j = 0; j < a.length - 1; j++) {
				z += 11;
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
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
		// int[] tst = { 1, 2, 3, 7, 6, 5 };
		int n = 5;
		int[] tst = new int[n];
		for (int i = 0; i < tst.length; i++) {
			tst[i] = i;
		}
		System.out.println(Arrays.toString(tst));
		SortingMethods.bubbleSort(tst);
		System.out.println(Arrays.toString(tst));
		System.out.printf("Contagem de operações= %d\n", z);
	}

}
