package br.com.camilla;

import java.util.List;

public class AdministracaoSistema {
	
	private List <RegistroPonto> registrosDePonto;
	private List <Empregado> listaDeEmpregados;
	/**
	 * @return the registrosDePonto
	 */
	public List<RegistroPonto> getRegistrosDePonto() {
		return registrosDePonto;
	}
	/**
	 * @param registrosDePonto the registrosDePonto to set
	 */
	public void setRegistrosDePonto(List<RegistroPonto> registrosDePonto) {
		this.registrosDePonto = registrosDePonto;
	}
	/**
	 * @return the listaDeEmpregados
	 */
	public List<Empregado> getListaDeEmpregados() {
		return listaDeEmpregados;
	}
	/**
	 * @param listaDeEmpregados the listaDeEmpregados to set
	 */
	public void setListaDeEmpregados(List<Empregado> listaDeEmpregados) {
		this.listaDeEmpregados = listaDeEmpregados;
	}
	
	
}
