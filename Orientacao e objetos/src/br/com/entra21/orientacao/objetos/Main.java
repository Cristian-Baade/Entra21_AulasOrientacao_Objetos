package br.com.entra21.orientacao.objetos;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.classes.Aluno;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno alunoTeste = new Aluno();

		Aluno outroAluno = new Aluno();

		Aluno alunoObjeto;

		alunoObjeto = new Aluno();

		alunoObjeto.idade = 18;

		alunoTeste.nome = "Rubem";
		alunoTeste.idade = 33;

		Aluno alunoNovato = new Aluno();

		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";

		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		/*
		 * System.out.println("Qual o nome do aluno novato?");
		 * alunoNovato.nome=entrada.next();
		 * 
		 * System.out.println("Qual a idade do "+alunoNovato.nome+ "?");
		 * alunoNovato.idade=entrada.nextByte();
		 * 
		 * System.out.println("Bem vindo "+alunoNovato.nome);
		 */

	}

}
