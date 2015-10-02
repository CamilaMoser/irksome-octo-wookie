package br.pucrs.alpro3lm.arvores;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
public class ArvoreBinariaDePesquisa {

	private Nodo raiz;

	/**
	 * Insere uma nova chave na árvore.
	 * 
	 * Em caso de duplicatas, uma exceção é gerada.
	 * 
	 * @param chave
	 *            o valor da nova chave
	 */
	public void inserir(int chave) {
		raiz = inserir0(raiz, chave);
	}

	/**
	 * 
	 * @param nodo
	 * @param chave
	 * @return
	 */
	private Nodo inserir0(Nodo nodo, int chave) {
		if (nodo == null)
			return new Nodo(chave);

		if (chave < nodo.chave) {
			nodo.esquerdo = inserir0(nodo.esquerdo, chave);
			// TODO: verificar se houve desequilíbrio
			// TODO: realizar rotação
		} else if (chave > nodo.chave) {
			nodo.direito = inserir0(nodo.direito, chave);
			// TODO: verificar se houve desequilíbrio
			// TODO: realizar rotação
		} else
			throw new IllegalArgumentException("Chave duplicada");

		nodo.altura = Math.max(h(nodo.esquerdo), h(nodo.direito)) + 1;
		
		return nodo;
	}

	private int h(Nodo nodo) {
		
		return nodo == null ? -1 : nodo.altura;
	}

	@Override
	public String toString() {
		return String.format("ArvoreBinariaDePesquisa%n[raiz=%s]",
				toString0(raiz));
	}

	private String toString0(Nodo nodo) {
		if (nodo == null)
			return " # ";

		int delta = getAltura0(nodo.esquerdo) - getAltura0(nodo.direito);
		String msg = String
				.format("%d  nível= ? altura= %d delta= %d grau= %d pai= ? tio = ? %n[%s]%n[%s]",
						nodo.chave, getAltura0(nodo), delta, grau(nodo),
						toString0(nodo.esquerdo), toString0(nodo.direito));

		return msg;
	}

	private int grau(Nodo nodo) {
		if (nodo == null)
			return -1;

		int g = 0;
		if (nodo.esquerdo != null)
			g++;
		if (nodo.direito != null)
			g++;

		return g++;
	}

	public boolean consultar(int chave) {
		return consultar0(raiz, chave);
	}

	private boolean consultar0(Nodo nodo, int chave) {
		if (nodo == null)
			return false;

		if (chave < nodo.chave)
			return consultar0(nodo.esquerdo, chave);
		else if (chave > nodo.chave)
			return consultar0(nodo.direito, chave);
		else
			return true;
	}

	public int getAltura() {
		return getAltura0(raiz);
	}

	private int getAltura0(Nodo nodo) {
		if (nodo == null)
			return -1;

		return 1 + Math
				.max(getAltura0(nodo.esquerdo), getAltura0(nodo.direito));
	}

	public boolean isEquilibrada() {
		return isEquilibrada0(raiz);
	}

	private boolean isEquilibrada0(Nodo nodo) {
		if (nodo == null)
			return true;
		int delta = getAltura0(nodo.esquerdo) - getAltura0(nodo.direito);

		if (delta == 2 || delta == -2)
			return false;
		
		return isEquilibrada0(nodo.esquerdo)
				&& isEquilibrada0(nodo.direito);
	}

}
