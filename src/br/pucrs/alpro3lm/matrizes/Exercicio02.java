package br.pucrs.alpro3lm.matrizes;

public class Exercicio02 {

	public static void main(String[] args) {
		int[][] a = { { 1, 0 }, { 0, 2 } };
		int[][] b = { { 0, 1 }, { 1, 2 } };
		int[][] c = { { 0, 1 }, { 2, 0 } };
		int[][] r;
		
		r = multiplicar(a, b);
	}

	private static int[][] multiplicar(int[][] a, int[][] b) {
		if (b.length != a[0].length)
			throw new RuntimeException("Numero de linhas de b deve coincidir com o numero de colunas de a.");
		
		int[][] r = new int[a.length][b[0].length];
		
		// TODO: calcular r
		
		return r;
	}

}
