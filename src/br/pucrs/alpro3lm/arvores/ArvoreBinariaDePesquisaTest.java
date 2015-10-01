package br.pucrs.alpro3lm.arvores;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArvoreBinariaDePesquisaTest {

	@Test
	public void testArvoreVazia() {
		ArvoreBinariaDePesquisa arvore = new ArvoreBinariaDePesquisa();
		String expected = "ArvoreBinariaDePesquisa [raiz= # ]";
		String actual = arvore.toString();
		assertEquals("Falha ao consultar a Árvore vazia!", expected, actual);;
	}

	@Test(expected=IllegalArgumentException.class)
	public void testInserirComDuplicata() {
		ArvoreBinariaDePesquisa arvore = new ArvoreBinariaDePesquisa();
		arvore.inserir(42);
		arvore.inserir(42);
	}
	
	@Test
	public void testArvoreComDoisNodos() {
		ArvoreBinariaDePesquisa arvore = new ArvoreBinariaDePesquisa();
		arvore.inserir(42);
		arvore.inserir(46);
		String expected = "ArvoreBinariaDePesquisa [raiz= 42 [ # ][ 46 [ # ][ # ]]]";
		String actual = arvore.toString();
		assertEquals("Falha na estrutura daÁrvore!", expected, actual);;
	}
	
	@Test
	public void testConsultarArvoreVazia() {
		ArvoreBinariaDePesquisa arvore = new ArvoreBinariaDePesquisa();
		boolean expected = false;
		boolean actual = arvore.consultar(42);
		assertEquals("Falha ao consultar chave na �rvore vazia!", expected, actual);;
	}

	@Test
	public void testConsultarArvoreUnitaria() {
		ArvoreBinariaDePesquisa arvore = new ArvoreBinariaDePesquisa();
		arvore.inserir(42);
		boolean expected = true;
		boolean actual = arvore.consultar(42);
		assertEquals("Falha ao consultar chave na �rvore vazia!", expected, actual);;
	}
}
