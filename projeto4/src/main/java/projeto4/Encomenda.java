package projeto4;

import java.time.LocalDate;
import java.util.List;

public class Encomenda {
	
	private Long codigo;
	private Long idCliente;
	private List <ItemEncomenda> listaItemEncomenda;
	private LocalDate data;
	private LocalDate dataPrevisaoEntrega;
	private LocalDate dataVencimentoPagamento;
	private String estadoEntrega;
	private Double valorTotal;
	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the idCliente
	 */
	public Long getIdCliente() {
		return idCliente;
	}
	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * @return the listaItemEncomenda
	 */
	public List<ItemEncomenda> getListaItemEncomenda() {
		return listaItemEncomenda;
	}
	/**
	 * @param listaItemEncomenda the listaItemEncomenda to set
	 */
	public void setListaItemEncomenda(List<ItemEncomenda> listaItemEncomenda) {
		this.listaItemEncomenda = listaItemEncomenda;
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
	 * @return the dataPrevisaoEntrega
	 */
	public LocalDate getDataPrevisaoEntrega() {
		return dataPrevisaoEntrega;
	}
	/**
	 * @param dataPrevisaoEntrega the dataPrevisaoEntrega to set
	 */
	public void setDataPrevisaoEntrega(LocalDate dataPrevisaoEntrega) {
		this.dataPrevisaoEntrega = dataPrevisaoEntrega;
	}
	/**
	 * @return the dataVencimentoPagamento
	 */
	public LocalDate getDataVencimentoPagamento() {
		return dataVencimentoPagamento;
	}
	/**
	 * @param dataVencimentoPagamento the dataVencimentoPagamento to set
	 */
	public void setDataVencimentoPagamento(LocalDate dataVencimentoPagamento) {
		this.dataVencimentoPagamento = dataVencimentoPagamento;
	}
	/**
	 * @return the estadoEntrega
	 */
	public String getEstadoEntrega() {
		return estadoEntrega;
	}
	/**
	 * @param estadoEntrega the estadoEntrega to set
	 */
	public void setEstadoEntrega(String estadoEntrega) {
		this.estadoEntrega = estadoEntrega;
	}
	/**
	 * @return the valorTotal
	 */
	public Double getValorTotal() {
		return valorTotal;
	}
	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
