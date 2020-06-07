package projeto4;

public class PreferenciaProduto {
	
	private Long cliente; //código do cliente
	private String linhaProduto;
	/**
	 * @return the cliente
	 */
	public Long getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the linhaProduto
	 */
	public String getLinhaProduto() {
		return linhaProduto;
	}
	/**
	 * @param linhaProduto the linhaProduto to set
	 */
	public void setLinhaProduto(String linhaProduto) {
		this.linhaProduto = linhaProduto;
	}

}
