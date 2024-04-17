package br.com.e2etreinamentos.apispring.model;

public class Usuario {

	private static long contador = 0;

	private long id;
	private String nomeCompleto;
	private String nomeUsuario;
	private String senha;
	private String confirmacaoSenha;

	public Usuario() {
		id = contador++; 
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmacaoSenha() {
		return confirmacaoSenha;
	}

	public void setConfirmacaoSenha(String confirmacaoSenha) {
		this.confirmacaoSenha = confirmacaoSenha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static long getContador() {
		return contador;
	}

	public static void setContador(long contador) {
		Usuario.contador = contador;
	}
}
