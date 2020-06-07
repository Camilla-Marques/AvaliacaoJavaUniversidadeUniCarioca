package br.com.camilla;

public class Empregado {
	

	private Long id;
	private String nome;
	private String sobrenome;
	private EnumFormaPagamento formaPagamento;
	private Double valorHora;
	private Double valorMes;
	private Boolean recebePorHora;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}
	/**
	 * @param sobrenome the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	/**
	 * @return the formaPagamento
	 */
	public EnumFormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	/**
	 * @param formaPagamento the formaPagamento to set
	 */
	public void setFormaPagamento(EnumFormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	/**
	 * @return the valorHora
	 */
	public Double getValorHora() {
		return valorHora;
	}
	/**
	 * @param valorHora the valorHora to set
	 */
	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	/**
	 * @return the valorMes
	 */
	public Double getValorMes() {
		return valorMes;
	}
	/**
	 * @param valorMes the valorMes to set
	 */
	public void setValorMes(Double valorMes) {
		this.valorMes = valorMes;
	}
	/**
	 * @return the recebePorHora
	 */
	public Boolean getRecebePorHora() {
		return recebePorHora;
	}
	/**
	 * @param recebePorHora the recebePorHora to set
	 */
	public void setRecebePorHora(Boolean recebePorHora) {
		this.recebePorHora = recebePorHora;
	}

}
