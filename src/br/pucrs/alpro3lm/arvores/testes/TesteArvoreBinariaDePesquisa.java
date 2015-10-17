package br.pucrs.alpro3lm.arvores.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		
		//arvore.printSequenciasDePares();
		//System.out.println(arvore.getNivel(2));
		arvore.printNivelDeImpares();
		
		/*
		System.out.println(arvore);
		List<Integer> ca = arvore.getCaminho(9);
		Collections.reverse(ca);
		System.out.println(ca);
		
		List<Integer> cb = arvore.getCaminho(14);
		System.out.println(cb);
		*/
		/*List<Integer> cab = new ArrayList<>(ca);
		for (Integer v : cb) {
			if (!cab.contains(v))
				cab.add(v);
		}
		System.out.println(cab);*/
		
		
		
		//arvore.preOrdem();
		//arvore.central();
		//arvore.posOrdem();
		//System.out.println(arvore.isEquilibrada());
		
	}
}
