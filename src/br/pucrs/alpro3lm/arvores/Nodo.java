package br.pucrs.alpro3lm.arvores;


// TODO: utilizar classe interna na classe ArvoreBinariaDePesquisa
// TODO: retirar o public e tornar a classe inacessível fora deste pacote
public class Nodo<T> {

	public T chave;
	
	public int altura;	
	
	public Nodo<T> esquerdo;
	public Nodo<T> direito;
	
	public Nodo(T chave) {
		this.chave = chave;
		altura = 0;
		esquerdo = direito = null;
	}
}
