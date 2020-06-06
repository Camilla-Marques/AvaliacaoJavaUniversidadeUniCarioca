package br.com.camilla;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
	
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setProfessor("Camilla Marques");
		avaliacao.setMedia(8.5);
		avaliacao.setDisciplina("Java");
		avaliacao.setData(new Date());

		System.out.println("Criado instancia avaliação: " + avaliacao+"\n\n");
		

		A1 a1 = new A1();
		a1.setProfessor("Camilla Marques");
		a1.setMedia(8.5);
		a1.setDisciplina("Java");
		a1.setData(new Date());
		
		System.out.println("Criado instancia A1: " + a1+"\n\n");
		
		VS vs = new VS();

		vs.setProfessor("Camilla Marques");
		vs.setMedia(8.5);
		vs.setDisciplina("Java");
		vs.setData(new Date());
		
		System.out.println("Criado instancia VS: " + vs+"\n\n");

		TrabalhoExtra trabalhoExtra = new TrabalhoExtra();

		trabalhoExtra.setProfessor("Camilla Marques");
		trabalhoExtra.setMedia(8.5);
		trabalhoExtra.setDisciplina("Java");
		trabalhoExtra.setData(new Date());
		
		System.out.println("Criado instancia TrabahoExtra: " + trabalhoExtra);
	
	}

}
