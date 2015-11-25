package br.pucrs.alpro3lm.grafos;

public class GrafoApp {

	public static void main(String[] args) {
//		Grafo g1 = new Grafo(5);
//		Grafo g1 = new Grafo(7);
//		Grafo g1 = new Grafo(9);
		Grafo g1 = new Grafo(6);
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
//		g1.adicionarArco(1, 2, 1);
//		g1.adicionarArco(1, 7, 3);
//		g1.adicionarArco(2, 3, 6);
//		
//		g1.adicionarArco(2, 6, 5);
//
//		g1.adicionarArco(3, 4, 1);
//		g1.adicionarArco(3, 5, 2);
		
//		g1.adicionarArco(1, 2);
//		g1.adicionarArco(1, 3);
//		
//		g1.adicionarArco(2, 4);
//		g1.adicionarArco(2, 6);
//
//		g1.adicionarArco(3, 2);
//		g1.adicionarArco(3, 4);
//		g1.adicionarArco(3, 6);
//		g1.adicionarArco(3, 8);
//
//		g1.adicionarArco(4, 5);
//		g1.adicionarArco(4, 6);
//
//		g1.adicionarArco(5, 7);
//
//		g1.adicionarArco(6, 5);
//		g1.adicionarArco(6, 8);
//		g1.adicionarArco(6, 9);
//		
//		g1.adicionarArco(7, 9);
//		
//		g1.adicionarArco(8, 7);
//		g1.adicionarArco(8, 9);
		
		// A
		g1.adicionarArco(1, 3, 2);
		g1.adicionarArco(1, 2, 7);
		
		// B
		g1.adicionarArco(2, 4, 3);
		
		// C
		g1.adicionarArco(3, 2, 1);
		g1.adicionarArco(3, 4, 2);
		g1.adicionarArco(3, 5, 8);

		// D
		g1.adicionarArco(4, 5, 3);
		g1.adicionarArco(4, 6, 5);

		// E
		g1.adicionarArco(5, 6, 1);

		System.out.println(g1);
		
		//System.out.println(g1.topologica());
		//System.out.println(g1.caminho(1, 9));
		//System.out.println(g1.fordFulkerson(1, 9));

		//System.out.println("Largura:");
		//System.out.println(g1.largura(1));
		//System.out.println("Distância Dois");
		//System.out.println(g1.getAllToTwoR(1));
		//System.out.println("Profundidade:");
		//System.out.println(g1.profundidade(1));
		g1.dijkstra(1);

	}
}
