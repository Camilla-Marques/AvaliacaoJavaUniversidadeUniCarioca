package br.com.camilla;

import java.util.Date;

public class Avaliacao {
	
	private String disciplina;
	private Double media;
	private String professor;
	private Date data;
	

	/**
	 * @return the disciplina
	 */
	public String getDisciplina() {
		return disciplina;
	}

	/**
	 * @param disciplina the disciplina to set
	 */
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	/**
	 * @return the media
	 */
	public Double getMedia() {
		return media;
	}

	/**
	 * @param media the media to set
	 */
	public void setMedia(Double media) {
		this.media = media;
	}

	/**
	 * @return the professor
	 */
	public String getProfessor() {
		return professor;
	}

	/**
	 * @param professor the professor to set
	 */
	public void setProfessor(String professor) {
		this.professor = professor;
	}

	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Avaliacao [disciplina=" + disciplina + ", media=" + media + ", professor=" + professor + ", data="
				+ data + "]";
	}
	

}