package projeto4;

import java.util.List;

public class Fabrica {
	
	private List <Encomenda> listaDeEncomendas;

	/**
	 * @return the listaDeEncomendas
	 */
	public List<Encomenda> getListaDeEncomendas() {
		return listaDeEncomendas;
	}

	/**
	 * @param listaDeEncomendas the listaDeEncomendas to set
	 */
	public void setListaDeEncomendas(List<Encomenda> listaDeEncomendas) {
		this.listaDeEncomendas = listaDeEncomendas;
	}

}
