package org.generation.PlanteUmaArvore.model;

public class UserLogin {
	
	
	private String nome;
	
	
	
	private String senha;
	
	private String email;
	
	private String token;
	
	private String foto;	
	
	// get and set	

	public String getNome() {
		return nome;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	
	

}
