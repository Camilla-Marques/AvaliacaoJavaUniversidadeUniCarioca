package br.com.camilla;

import java.time.LocalDate;

public class RegistroPonto {
	
	private Long idCartao;
	private LocalDate data; 
	private LocalDate quantidadeHorasTrabalhadas;
	/**
	 * @return the idCartao
	 */
	public Long getIdCartao() {
		return idCartao;
	}
	/**
	 * @param idCartao the idCartao to set
	 */
	public void setIdCartao(Long idCartao) {
		this.idCartao = idCartao;
	}
	/**
	 * @return the data
	 */
	public LocalDate getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(LocalDate data) {
		this.data = data;
	}
	/**
	 * @return the quantidadeHorasTrabalhadas
	 */
	public LocalDate getQuantidadeHorasTrabalhadas() {
		return quantidadeHorasTrabalhadas;
	}
	/**
	 * @param quantidadeHorasTrabalhadas the quantidadeHorasTrabalhadas to set
	 */
	public void setQuantidadeHorasTrabalhadas(LocalDate quantidadeHorasTrabalhadas) {
		this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
	}

}
