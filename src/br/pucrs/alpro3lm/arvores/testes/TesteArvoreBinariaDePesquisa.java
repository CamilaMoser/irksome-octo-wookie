package br.pucrs.alpro3lm.arvores.testes;

import br.pucrs.alpro3lm.arvores.ArvoreBinariaDePesquisa;

public class TesteArvoreBinariaDePesquisa {
	public static void main(String[] args) {
		System.out.println("Teste");
		
		ArvoreBinariaDePesquisa arvore = new ArvoreBinariaDePesquisa();
		arvore.inserir(30);
		arvore.inserir(10);
		arvore.inserir(20);
		
		System.out.println(arvore);
		System.out.println(arvore.isEquilibrada());
		
	}
}
