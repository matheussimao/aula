package model;

public class Pessoa {
	private String nome;
	private String enderešo;
	private String bairro;
	private long cep;
	private String cidade;
	private String estado;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	
	
	public String getEnderešo() {
		return enderešo;
	}
	
	
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	public String getBairro() {
		return bairro;
	}
	
	
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	public String getCep() {
		return cep;
	}
	
}
