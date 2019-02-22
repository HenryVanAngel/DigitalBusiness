package br.com.fiap.loja;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.apache.log4j.Logger;

import br.com.fiap.loja.bo.EstoqueBO;
import br.com.fiap.loja.singleton.PropertySingleton;
import br.com.fiap.loja.to.ProdutoTO;

public class TerminalConsulta {

	private static Logger log = Logger.getLogger(TerminalConsulta.class);
	public static void main(String[] args) {
		log.warn("Come�o da aplica��o");
		String nome = PropertySingleton.getInstance().getProperty("nome");
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = 	DateTimeFormatter.ofPattern(PropertySingleton.getInstance().getProperty("mascara"));
		System.out.println(nome + " " + hoje.format(formatador));
		System.out.println("Digite o c�digo do produto desejado: ");
		Scanner scanner = new Scanner(System.in);
		int codigo = scanner.nextInt();
		scanner.close();
		
		ProdutoTO produto = EstoqueBO.consultarProduto(codigo);
		System.out.println(produto.getDescricao());
		log.warn("Fim da aplica��o");
	}

}
