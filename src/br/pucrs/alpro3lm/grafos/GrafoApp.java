package br.pucrs.alpro3lm.grafos;

public class GrafoApp {

	public static void main(String[] args) {
//		Grafo g1 = new Grafo(5);
		Grafo g1 = new Grafo(7);
		//Grafo g1 = new Grafo("g1.txt");

		System.out.println(g1);	
		
//		g1.adicionarArco(1, 2);
//		g1.adicionarArco(1, 3);
//		g1.adicionarArco(1, 5);
//		
//		g1.adicionarArco(5, 4);
//
//		g1.adicionarArco(4, 3);
//		g1.adicionarArco(4, 2);		
		
		//
		g1.adicionarArco(1, 2, 1);
		g1.adicionarArco(1, 7, 3);
		g1.adicionarArco(2, 3, 6);
		
		g1.adicionarArco(2, 6, 5);

		g1.adicionarArco(3, 4, 1);
		g1.adicionarArco(3, 5, 2);
		
		System.out.println(g1);
		//
		
		System.out.println("Largura:");
		System.out.println(g1.largura(1));
		//System.out.println("Distância Dois");
		//System.out.println(g1.getAllToTwoR(1));
		//System.out.println("Profundidade:");
		//System.out.println(g1.profundidade(1));
		g1.dijkstra(3);

	}
}
