package br.com.myproject.hospital.model;

abstract class Pessoa {
	protected String cpf;
	protected String nome;
	protected String email;
	protected String endereco;
	protected long telefone;

	public Pessoa(String cpf, String nome, String email, String endereco,
			long telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	// Métodos Getters e Setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

}
