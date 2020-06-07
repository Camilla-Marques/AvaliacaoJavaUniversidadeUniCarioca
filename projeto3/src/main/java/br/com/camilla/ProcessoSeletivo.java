package br.com.camilla;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivo {

	private long id;
	private String vaga;
	private String descricaoVaga;
	private LocalDate data;
	private List<Candidato> listaCandidatos;
	private List<Candidato> listaCandidatosParticipou;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVaga() {
		return vaga;
	}

	public void setVaga(String vaga) {
		this.vaga = vaga;
	}

	public String getDescricaoVaga() {
		return descricaoVaga;
	}

	public void setDescricaoVaga(String descricaoVaga) {
		this.descricaoVaga = descricaoVaga;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public List<Candidato> getListaCandidatos() {
		return listaCandidatos;
	}

	public void setListaCandidatos(List<Candidato> listaCandidatos) {
		this.listaCandidatos = listaCandidatos;
	}

	public List<Candidato> getListaCandidatosParticipou() {
		return listaCandidatosParticipou;
	}

	public void setListaCandidatosParticipouProcessoSeletivo(List<Candidato> listaCandidatosParticipouProcessoSeletivo) {
		this.listaCandidatosParticipou = listaCandidatosParticipouProcessoSeletivo;
	}

	public List<Candidato> listarCanditatos(boolean participouProcessoSelettivo) {
		return  participouProcessoSelettivo ? this.listaCandidatosParticipou :  this.listaCandidatos;
	}

	public void adicionarCandidato(Candidato candidato, boolean participouProcessoSelettivo) {

		if (this.listaCandidatos == null) {
			this.listaCandidatos = new ArrayList<Candidato>();
		}
		if (this.listaCandidatosParticipou == null) {
			this.listaCandidatosParticipou = new ArrayList<Candidato>();
		}

		if (participouProcessoSelettivo) {
			this.listaCandidatosParticipou.add(candidato);
		} else {
			this.listaCandidatos.add(candidato);
		}
	}

	@Override
	public String toString() {
		return "ProcessoSeletivo [id=" + id + ", vaga=" + vaga + ", descricaoVaga=" + descricaoVaga + ", data=" + data
				+ ", listaCandidatos=" + listaCandidatos + ", listaCandidatosParticipouProcessoSeletivo="
				+ listaCandidatosParticipou + "]";
	}

}
