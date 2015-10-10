package br.pucrs.alpro3lm.arvores;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
public class ArvoreBinariaDePesquisa<T extends Comparable<T>> {

	private Nodo<T> raiz;

	/**
	 * Insere uma nova chave na árvore.
	 * 
	 * Em caso de duplicatas, uma exceção é gerada.
	 * 
	 * @param chave
	 *            o valor da nova chave
	 */
	public void inserir(T chave) {
		raiz = inserir0(raiz, chave);
	}

	/**
	 * 
	 * @param nodo
	 * @param chave
	 * @return
	 */
	private Nodo<T> inserir0(Nodo<T> nodo, T chave) {
		if (nodo == null)
			return new Nodo<>(chave);

		//if (chave < nodo.chave) {
		if (chave.compareTo(nodo.chave) < 0) {
			nodo.esquerdo = inserir0(nodo.esquerdo, chave);
			if (h(nodo.esquerdo) - h(nodo.direito) == 2) {
				//if (chave < nodo.esquerdo.chave) {
				if (chave.compareTo(nodo.esquerdo.chave) < 0) {
					nodo = rotacionarComFilhoEsquerdo(nodo);
				} else {
					nodo = duplaComFilhoEsquerdo(nodo);
				}
			}
		//} else if (chave > nodo.chave) {
			} else if (chave.compareTo(nodo.chave) > 0) {
			nodo.direito = inserir0(nodo.direito, chave);
			if (h(nodo.esquerdo) - h(nodo.direito) == -2) {
				//if (chave > nodo.direito.chave) {
					if (chave.compareTo(nodo.direito.chave) > 0) {
				nodo = rotacionarComFilhoDireito(nodo);
				} else {
					nodo = duplaComFilhoDireito(nodo);					
				}
			}
		} else
			throw new IllegalArgumentException("Chave duplicada");

		nodo.altura = Math.max(h(nodo.esquerdo), h(nodo.direito)) + 1;

		return nodo;
	}

	private Nodo<T> duplaComFilhoDireito(Nodo<T> k1) {
		k1.direito = rotacionarComFilhoEsquerdo(k1.direito);
		return rotacionarComFilhoDireito(k1);
	}

	private Nodo<T> duplaComFilhoEsquerdo(Nodo<T> k3) {
		k3.esquerdo = rotacionarComFilhoDireito(k3.esquerdo);
		return rotacionarComFilhoEsquerdo(k3);
	}

	private Nodo<T> rotacionarComFilhoDireito(Nodo<T> k1) {
		Nodo<T> k2 = k1.direito;
		k1.direito = k2.esquerdo;
		k2.esquerdo = k1;

		k1.altura = Math.max(h(k1.esquerdo), h(k1.direito)) + 1;
		k2.altura = Math.max(k1.altura, h(k2.direito)) + 1;

		return k2;
	}

	private Nodo<T> rotacionarComFilhoEsquerdo(Nodo<T> k2) {
		Nodo<T> k1 = k2.esquerdo;
		k2.esquerdo = k1.direito;
		k1.direito = k2;

		k2.altura = Math.max(h(k2.esquerdo), h(k2.direito)) + 1;
		k1.altura = Math.max(h(k1.esquerdo), k2.altura) + 1;

		return k1;
	}

	private int h(Nodo<T> nodo) {

		return nodo == null ? -1 : nodo.altura;
	}

	public void preOrdem() {
		System.out.println("PRE=");
		preOrdem0(raiz);
		System.out.println();
	}
	

	private void preOrdem0(Nodo<T> nodo) {
		if (nodo == null)
			return;

		System.out.print(" " + nodo.chave);
		
		preOrdem0(nodo.esquerdo);
		preOrdem0(nodo.direito);

	}

	public void central() {
		System.out.println("CENTRAL=");
		central0(raiz);
		System.out.println();
	}
	
	private void central0(Nodo<T> nodo) {
		if (nodo == null)
			return;

		central0(nodo.esquerdo);

		System.out.print(" " + nodo.chave);
		
		central0(nodo.direito);
	}

	public void posOrdem() {
		System.out.println("POS=");	
		posOrdem0(raiz);
		System.out.println();
	}
	
	private void posOrdem0(Nodo<T> nodo) {
		if (nodo == null)
			return;

		posOrdem0(nodo.esquerdo);
		posOrdem0(nodo.direito);

		System.out.print(" " + nodo.chave);	
	}	
	
	@Override
	public String toString() {
		return String.format("ArvoreBinariaDePesquisa [raiz=%s]",
				toString0(raiz));
	}

	/**
	 * Pré-ordem
	 * @param nodo
	 * @return
	 */
	private String toString0(Nodo<T> nodo) {
		if (nodo == null)
			return " # ";

		int delta = getAltura0(nodo.esquerdo) - getAltura0(nodo.direito);
		String msg = String
				.format("%s  nível= ? altura= %d delta= %d grau= %d pai= ? tio = ? %n[%s]%n[%s]",
						nodo.chave, getAltura0(nodo), delta, grau(nodo),
						toString0(nodo.esquerdo), toString0(nodo.direito));

		return msg;
	}

	private int grau(Nodo<T> nodo) {
		if (nodo == null)
			return -1;

		int g = 0;
		if (nodo.esquerdo != null)
			g++;
		if (nodo.direito != null)
			g++;

		return g++;
	}

	public boolean consultar(T chave) {
		return consultar0(raiz, chave);
	}

	private boolean consultar0(Nodo<T> nodo, T chave) {
		if (nodo == null)
			return false;

		//if (chave < nodo.chave)
		if (chave.compareTo(nodo.chave) < 0)
			return consultar0(nodo.esquerdo, chave);
		else if (chave.compareTo(nodo.chave) > 0)
			return consultar0(nodo.direito, chave);
		else
			return true;
	}

	public int getAltura() {
		return getAltura0(raiz);
	}

	/**
	 * Pós-ordem
	 * 
	 * @param nodo
	 * @return
	 */
	private int getAltura0(Nodo<T> nodo) {
		if (nodo == null)
			return -1;

		int ae = getAltura0(nodo.esquerdo);
		int ad = getAltura0(nodo.direito);
		
		return 1 + Math.max(ae, ad);
	}

	public boolean isEquilibrada() {
		return isEquilibrada0(raiz);
	}

	private boolean isEquilibrada0(Nodo<T> nodo) {
		if (nodo == null)
			return true;
		int delta = getAltura0(nodo.esquerdo) - getAltura0(nodo.direito);

		if (delta == 2 || delta == -2)
			return false;

		return isEquilibrada0(nodo.esquerdo) && isEquilibrada0(nodo.direito);
	}

}
