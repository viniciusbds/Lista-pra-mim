package com.projeto.excecoes;

/**
 * Excecao lancada quando ha alguma operacao relacionada a uma compra ainda nao foi cadatrada
 */

@SuppressWarnings("serial")
public class CompraNaoCadastrada extends RuntimeException{

	/**
	 * Inicializador da excecao
	 * @param msg
	 */
	public CompraNaoCadastrada(String msg) {
		super(msg + "compra nao encontrada na lista.");
	}
}
