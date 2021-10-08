package br.edu.infnet.appTabacaria.todas.classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venda {
	
	private String produtoDescricao;
	private LocalDateTime data;
	private Comprador comprador;

	public Venda() {
		data = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(produtoDescricao);
		sb.append(";");
		sb.append(data.format(formato));
		sb.append(";");
		sb.append(comprador);
	
		
		
		return super.toString();
	}
	
	public String getProdutoDescricao() {
		return produtoDescricao;
	}

	public void setProdutoDescricao(String produtoDescricao) {
		this.produtoDescricao = produtoDescricao;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

}
