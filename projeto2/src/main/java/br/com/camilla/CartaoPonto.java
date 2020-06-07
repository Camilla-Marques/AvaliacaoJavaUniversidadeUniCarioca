package br.com.camilla;

import java.time.LocalDate;

public class CartaoPonto {
	
	private Long idEmpregado;
	private Long idCartaoPonto;
	private LocalDate dataAdmissao;
	/**
	 * @return the idEmpregado
	 */
	public Long getIdEmpregado() {
		return idEmpregado;
	}
	/**
	 * @param idEmpregado the idEmpregado to set
	 */
	public void setIdEmpregado(Long idEmpregado) {
		this.idEmpregado = idEmpregado;
	}
	/**
	 * @return the idCartaoPonto
	 */
	public Long getIdCartaoPonto() {
		return idCartaoPonto;
	}
	/**
	 * @param idCartaoPonto the idCartaoPonto to set
	 */
	public void setIdCartaoPonto(Long idCartaoPonto) {
		this.idCartaoPonto = idCartaoPonto;
	}
	/**
	 * @return the dataAdmissao
	 */
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	/**
	 * @param dataAdmissao the dataAdmissao to set
	 */
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

}
