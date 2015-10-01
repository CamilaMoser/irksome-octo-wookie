package br.pucrs.alpro3lm.arvores;


// TODO: utilizar classe interna na classe ArvoreBinariaDePesquisa
// TODO: retirar o public e tornar a classe inacessível fora deste pacote
public class Nodo {

	public int chave;
	
	public int altura;	
	
	public Nodo esquerdo;
	public Nodo direito;
	
	public Nodo(int chave) {
		this.chave = chave;
		altura = 0;
		esquerdo = direito = null;
	}
}
