package br.com.camilla;

public class Candidato {

	private long id;
	private String nome;
	private String sobrenome;
	private String experiencia;
	private boolean empregado;
	private boolean curriculoEnviado;

	public Candidato(long id, String nome, String sobrenome, String experiencia, boolean empregado,
			boolean curriculoEnviado) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.experiencia = experiencia;
		this.empregado = empregado;
		this.curriculoEnviado = curriculoEnviado;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	public boolean isEmpregado() {
		return empregado;
	}
	public void setEmpregado(boolean empregado) {
		this.empregado = empregado;
	}
	public boolean isCurriculoEnviado() {
		return curriculoEnviado;
	}
	public void setCurriculoEnviado(boolean curriculoEnviado) {
		this.curriculoEnviado = curriculoEnviado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Candidato [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", experiencia=" + experiencia
				+ ", empregado=" + empregado + ", curriculoEnviado=" + curriculoEnviado + "]";
	}
}
