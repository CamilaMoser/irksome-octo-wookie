package br.pucrs.alpro3lm.arvores.testes;

import br.pucrs.alpro3lm.arvores.ArvoreBinariaDePesquisa;

public class TesteArvoreBinariaDePesquisa {
	public static void main(String[] args) {
		System.out.println("Teste");
		
		ArvoreBinariaDePesquisa<Integer> arvore = new ArvoreBinariaDePesquisa<>();
		arvore.inserir(50);
		
		arvore.inserir(17);
		arvore.inserir(76);
		
		arvore.inserir(9);
		arvore.inserir(23);
		arvore.inserir(54);
		
		arvore.inserir(14);
		arvore.inserir(19);
		arvore.inserir(72);
		
		arvore.inserir(12);
		arvore.inserir(67);
		
		arvore.preOrdem();
		arvore.central();
		arvore.posOrdem();
		//System.out.println(arvore.isEquilibrada());
		
	}
}
