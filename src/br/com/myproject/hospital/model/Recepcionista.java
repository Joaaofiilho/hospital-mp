package br.com.myproject.hospital.model;

import java.util.Random;

public class Recepcionista extends Pessoa {

	protected int id;

	public Recepcionista(String cpf, String nome, String email,
			String endereco, long telefone, int id) {
		super(cpf, nome, email, endereco, telefone);
		Random random = new Random();
		id = random.nextInt(8999) + 1000;
	}

	// Métodos Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
