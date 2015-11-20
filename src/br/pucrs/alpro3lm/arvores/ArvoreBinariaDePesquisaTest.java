package br.pucrs.alpro3lm.arvores;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArvoreBinariaDePesquisaTest {

	@Test
	public void testArvoreVazia() {
		ArvoreBinariaDePesquisa<Integer> arvore = new ArvoreBinariaDePesquisa<>();
		String expected = "ArvoreBinariaDePesquisa [raiz= # ]";
		String actual = arvore.toString();
		assertEquals("Falha ao consultar a Árvore vazia!", expected, actual);
		;
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInserirComDuplicata() {
		ArvoreBinariaDePesquisa<Integer> arvore = new ArvoreBinariaDePesquisa<>();
		arvore.inserir(42);
		arvore.inserir(42);
	}

	@Test
	public void testArvoreComDoisNodos() {
		ArvoreBinariaDePesquisa<Integer> arvore = new ArvoreBinariaDePesquisa<>();
		arvore.inserir(42);
		arvore.inserir(46);
		// String expected =
		// "ArvoreBinariaDePesquisa [raiz= 42 [ # ][ 46 [ # ][ # ]]]";
		String expected = "ArvoreBinariaDePesquisa [raiz=46  nível= ? altura= 1 delta= 1 grau= 1 pai= ? tio = ?"
				+ "[42  nível= ? altura= 0 delta= 0 grau= 0 pai= ? tio = ?"
				+ "[ # ]" + "[ # ]]" + "[ # ]]";
		String actual = arvore.toString();
		assertEquals("Falha na estrutura daÁrvore!", expected, actual);
		;
	}

	@Test
	public void testConsultarArvoreVazia() {
		ArvoreBinariaDePesquisa<Integer> arvore = new ArvoreBinariaDePesquisa<>();
		boolean expected = false;
		boolean actual = arvore.consultar(42);
		assertEquals("Falha ao consultar chave na �rvore vazia!", expected,
				actual);
		;
	}

	@Test
	public void testConsultarArvoreUnitaria() {
		ArvoreBinariaDePesquisa<Integer> arvore = new ArvoreBinariaDePesquisa<>();
		arvore.inserir(42);
		boolean expected = true;
		boolean actual = arvore.consultar(42);
		assertEquals("Falha ao consultar chave na �rvore vazia!", expected,
				actual);
		;
	}
}
