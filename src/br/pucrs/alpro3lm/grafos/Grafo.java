package br.pucrs.alpro3lm.grafos;

public class Grafo {

	private int m[][];

	public Grafo(int nodos) {
		if (nodos <= 0)
			throw new IllegalArgumentException("Número de nodos inválido: "
					+ nodos);
		m = new int[nodos + 1][nodos + 1];
	}

	public void adicionarArco(int a, int b) {
		adicionarArco(a, b, 1);
	}

	public void adicionarArco(int a, int b, int v) {
		verificar(a);
		verificar(b);
		m[a][b] = v;
	}

	private void verificar(int a) {
		if (a <= 0 || a > m.length)
			throw new IllegalArgumentException("Nodo inválido: " + a);
	}

	@Override
	public String toString() {
		String s = "";
		s += "    ";
		for (int i = 1; i < m.length; i++) {
			s += i +" ";
		}
		s += "\n";
		for (int i = 1; i < m.length; i++) {
			s += i + "  ";
			for (int j = 1; j < m.length; j++) {
				s += m[i][j] + " ";
			}
			s += "\n";
		}
		return s;
	}

}
