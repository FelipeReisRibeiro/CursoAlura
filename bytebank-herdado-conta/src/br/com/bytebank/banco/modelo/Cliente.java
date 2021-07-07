package br.com.bytebank.banco.modelo;
public class Cliente {

	private String nome;
	private String cpf;
	private String porfissao;
	
	
	/**
	 * Classe que representa um cliente no Bytebank
	 * 
	 * @author Felipe
	 * @version
	 */
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPorfissao() {
		return porfissao;
	}
	public void setPorfissao(String porfissao) {
		this.porfissao = porfissao;
	}
	
	
	
}
