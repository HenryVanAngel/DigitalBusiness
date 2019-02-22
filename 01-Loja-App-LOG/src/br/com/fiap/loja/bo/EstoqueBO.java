package br.com.fiap.loja.bo;

import org.apache.log4j.Logger;

import br.com.fiap.loja.to.ProdutoTO;

public class EstoqueBO {
	private static Logger log = Logger.getLogger(EstoqueBO.class);
	public static ProdutoTO consultarProduto(int codigo) {
		if(codigo ==401) {
			log.debug("Condicao Camiseta Branca");
			return new ProdutoTO(codigo, "Camiseta branca", 4, 2.99);
		}else if(codigo == 402) {
			log.debug("Condicao Camiseta Azul");
			return new ProdutoTO(codigo, "Camiseta azul", 4, 2.99);
		}else if(codigo == 403) {
			log.debug("Condicao Camiseta Rosa");
			return new ProdutoTO(codigo, "Camiseta rosa", 4, 2.99);
		}else {
			log.error("Produto de codigo: "+codigo+ " nao encontrado");
			return new ProdutoTO(-1, "Produto nao encontrado", 0, 9);
		}
	}

}
