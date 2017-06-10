package br.com.myproject.hospital.model;

public class Consulta {
	protected String data;
	protected String hora;
	protected String medico;
	protected String especialidade;
	protected boolean confirmada;
	protected boolean reagendada;

	public Consulta(String data, String hora, String medico,
			String especialidade) {
		this.data = data;
		this.hora = hora;
		this.medico = medico;
		this.especialidade = especialidade;
		confirmada = false;
		reagendada = false;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public boolean isConfirmada() {
		return confirmada;
	}

	public void setConfirmada(boolean confirmada) {
		this.confirmada = confirmada;
	}

	public boolean isReagendada() {
		return reagendada;
	}

	public void setReagendada(boolean reagendada) {
		this.reagendada = reagendada;
	}

}
