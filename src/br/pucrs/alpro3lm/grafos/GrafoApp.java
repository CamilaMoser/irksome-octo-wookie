package br.pucrs.alpro3lm.grafos;

public class GrafoApp {

	public static void main(String[] args) {
		Grafo g1 = new Grafo(5);
		System.out.println(g1);		
		g1.adicionarArco(1, 5);
		System.out.println(g1);

	}
}
