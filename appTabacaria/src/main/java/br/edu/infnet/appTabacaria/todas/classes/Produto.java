package br.edu.infnet.appTabacaria.todas.classes;

public abstract class Produto {
	
	private String nome;
	private Float valor;
	private int codigo;
	
	public Produto(String nome, float valor, int codigo) {
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;

	
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(nome);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(codigo);
		
		return sb.toString();
		
	}

	public String getNome() {
		return nome;
	}

	public Float getValor() {
		return valor;
	}

	public int getCodigo() {
		return codigo;
	}
}
