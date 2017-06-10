package br.com.myproject.hospital.model;

public class Consulta {
	private String data, especialidade;
	private int hora, minuto;
	private boolean marcada;
	private long protocolo;
	
	
	
	//Construtor
	public Consulta(){
		this.data = "01/01/01";
		this.hora = 0;
		this.minuto = 0;
		this.marcada = false;
		this.especialidade = "indefinida";
	}

	
	//Métodos Setters e Getters
	
	
	public String getData() {
		return data;
	}

	public long getProtocolo() {
		return protocolo;
	}


	public void setProtocolo(long protocolo) {
		this.protocolo = protocolo;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public void setData(String data) {
		this.data = data;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public boolean isMarcada() {
		return marcada;
	}

	public void setMarcada(boolean marcada) {
		this.marcada = marcada;
	}
}
