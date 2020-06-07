package projeto4;

public class ItemEncomenda {
	
	private Long idItemEncomenda;
	private Long idProduto;
	private Double preco;
	private Long quantidade;
	/**
	 * @return the idItemEncomenda
	 */
	public Long getIdItemEncomenda() {
		return idItemEncomenda;
	}
	/**
	 * @param idItemEncomenda the idItemEncomenda to set
	 */
	public void setIdItemEncomenda(Long idItemEncomenda) {
		this.idItemEncomenda = idItemEncomenda;
	}
	/**
	 * @return the idProduto
	 */
	public Long getIdProduto() {
		return idProduto;
	}
	/**
	 * @param idProduto the idProduto to set
	 */
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
	/**
	 * @return the preco
	 */
	public Double getPreco() {
		return preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	/**
	 * @return the quantidade
	 */
	public Long getQuantidade() {
		return quantidade;
	}
	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

}
