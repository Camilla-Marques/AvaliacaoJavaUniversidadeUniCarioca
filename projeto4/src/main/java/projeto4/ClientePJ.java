package projeto4;

public class ClientePJ extends Cliente {
	
	private String numeroCPF;
	private String sexo;
	private String estadoCivil;
	/**
	 * @return the numeroCPF
	 */
	public String getNumeroCPF() {
		return numeroCPF;
	}
	/**
	 * @param numeroCPF the numeroCPF to set
	 */
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return the estadoCivil
	 */
	public String getEstadoCivil() {
		return estadoCivil;
	}
	/**
	 * @param estadoCivil the estadoCivil to set
	 */
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
