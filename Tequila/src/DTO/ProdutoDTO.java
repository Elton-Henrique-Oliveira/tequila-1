package DTO;

public class ProdutoDTO {
	private String nome_produto;
	private double preco_produto,peso_produto,custo_produto;
	private int codigo_produto;
	
	
	
	
	public int getCodigo_produto() {
		return codigo_produto;
	}
	public void setCodigo_produto(int codigo_produto) {
		this.codigo_produto = codigo_produto;
	}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public double getPreco_produto() {
		return preco_produto;
	}
	public void setPreco_produto(double preco_produto) {
		this.preco_produto = preco_produto;
	}
	public double getPeso_produto() {
		return peso_produto;
	}
	public void setPeso_produto(double peso_produto) {
		this.peso_produto = peso_produto;
	}
	public double getCusto_produto() {
		return peso_produto;
	}
	public void setCusto_produto(double peso_produto) {
		this.peso_produto = peso_produto;
	}
	
}
