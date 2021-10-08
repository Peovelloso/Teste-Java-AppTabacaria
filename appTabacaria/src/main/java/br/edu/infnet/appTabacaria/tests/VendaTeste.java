package br.edu.infnet.appTabacaria.tests;

import br.edu.infnet.appTabacaria.todas.classes.Comprador;
import br.edu.infnet.appTabacaria.todas.classes.Venda;

public class VendaTeste {
	
	public static void main(String[] args) {
		
		Comprador comprador = new Comprador("ppp", "peo@mail.com", "333.333.333-33", "29/10/1987");

		Venda venda = new Venda();
		venda.setProdutoDescricao("tabaco");
		venda.setComprador(comprador);
		System.out.println(venda);
	}

}
