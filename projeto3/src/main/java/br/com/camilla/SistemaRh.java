package br.com.camilla;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SistemaRh {

	private Map<Long, ProcessoSeletivo> processosSeletivos;

	public void adicionarProcessoSeletivo(ProcessoSeletivo processoSeletivo) {
		if (this.processosSeletivos == null) {
			this.processosSeletivos = new HashMap<Long, ProcessoSeletivo>();
		}
		this.processosSeletivos.put(processoSeletivo.getId(), processoSeletivo);
	}

	public ProcessoSeletivo getProcessoSeletivo(long id) {
		 return processosSeletivos.get(id);
	}

	public static void main(String[] args) {

		SistemaRh sistemaRh;
		ProcessoSeletivo processoSeletivo;
		Candidato candidato;

		System.out.println("\n\n*** Inicia sistema de RH ***\n\n");
		sistemaRh = new SistemaRh();

		processoSeletivo = new ProcessoSeletivo();
		processoSeletivo.setId(1);
		processoSeletivo.setVaga("Desenvolvedor");
		processoSeletivo.setDescricaoVaga("Atuar como desenvolvedor Java junior");
		processoSeletivo.setData(LocalDate.now());
		System.out.println("**********************************************************");
		System.out.println("Criado processo seletivo 1 : \n\n " + processoSeletivo);

		long candidatoIdSequence = 0;

		// Adiciona Processo Seletivo 1
		candidato = new Candidato(candidatoIdSequence++, "Alexa", "de Tala", "Trabalho no site Xoom", false, true);
		processoSeletivo.adicionarCandidato(candidato, true);
		System.out.println("\n\n Adicionado candidato 1 no processo seletivo 1:\n " + candidato);

		candidato = new Candidato(candidatoIdSequence++, "Ana", "de Tile", "Trabalho no site Zoom",false,true);
		processoSeletivo.adicionarCandidato(candidato, false);
		System.out.println("\n\n Adicionado candidato 2 que não participou no processo seletivo 1:\n " + candidato );

		candidato = new Candidato(candidatoIdSequence++, "Paulo", "Cesar", "Trabalho no site Buscape",false,true);
		processoSeletivo.adicionarCandidato(candidato, false);
		System.out.println("\n\n Adicionado candidato 2 no processo seletivo 1:\n " + candidato);

		candidato = new Candidato(candidatoIdSequence++, "Joao", "Cesar", "Trabalho no site Buscape",false,true);
		processoSeletivo.adicionarCandidato(candidato, false);
		System.out.println("\n\n Adicionado candidato 2 no processo seletivo 1:\n " + candidato);

		sistemaRh.adicionarProcessoSeletivo(processoSeletivo);
		System.out.println("\n\n");

		// Adiciona Processo Seletivo 1
		processoSeletivo = new ProcessoSeletivo();
		processoSeletivo.setId(2);
		processoSeletivo.setVaga("Gerente de Desenvolvimento");
		processoSeletivo.setDescricaoVaga("Atuar como gerente de desenvolvimento");
		processoSeletivo.setData(LocalDate.now());
		System.out.println("**********************************************************");
		System.out.println("Criado processo seletivo 2 : \n\n " + processoSeletivo);

		candidato = new Candidato(candidatoIdSequence++, "Panda", "de Tala", "Gerente no site Xoom", false, true);
		processoSeletivo.adicionarCandidato(candidato, true);
		System.out.println("\n\n Adicionado candidato 4 que participou no processo seletivo 2:\n " + candidato);

		candidato = new Candidato(candidatoIdSequence++, "Cris", "de Tile", "Gerente no site Zoom",false,true);
		processoSeletivo.adicionarCandidato(candidato, false);
		System.out.println("\n\n Adicionado candidato 5 que participou no processo seletivo 2:\n " + candidato);

		candidato = new Candidato(candidatoIdSequence++, "Montola", "Cesar", "Gerente no site Buscape",false,true);
		processoSeletivo.adicionarCandidato(candidato, false);
		System.out.println("\n\n Adicionado candidato 6 que participou no processo seletivo 2:\n " + candidato);

		sistemaRh.adicionarProcessoSeletivo(processoSeletivo);
		System.out.println("\n\n");

		// Relatorios

		System.out.println("**********************************************************");
		System.out.println("Lista candidatos que participaram do processo seletivo 1: \n");
		System.out.println(sistemaRh.getProcessoSeletivo(1));
		System.out.println("\n");
		System.out.println(sistemaRh.getProcessoSeletivo(1).getListaCandidatosParticipou());
		System.out.println("\n\n");

		System.out.println("**********************************************************");
		System.out.println("Lista candidatos que NÃO participaram do processo seletivo 1: \n");
		System.out.println(sistemaRh.getProcessoSeletivo(1));
		System.out.println("\n");
		System.out.println(sistemaRh.getProcessoSeletivo(1).getListaCandidatos());
		System.out.println("\n\n");

		System.out.println("**********************************************************");
		System.out.println("Lista candidatos que participaram do processo seletivo 2: \n");
		System.out.println(sistemaRh.getProcessoSeletivo(2));
		System.out.println("\n");
		System.out.println(sistemaRh.getProcessoSeletivo(2).getListaCandidatosParticipou());
		System.out.println("\n\n");

		System.out.println("**********************************************************");
		System.out.println("Lista candidatos que NÃO participaram do processo seletivo 2: \n");
		System.out.println(sistemaRh.getProcessoSeletivo(2));
		System.out.println("\n");
		System.out.println(sistemaRh.getProcessoSeletivo(2).getListaCandidatos());
		System.out.println("\n\n");
	}
}
