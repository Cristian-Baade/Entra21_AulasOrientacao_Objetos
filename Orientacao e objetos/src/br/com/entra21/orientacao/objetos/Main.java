package br.com.entra21.orientacao.objetos;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.heranca.Funcionario;

public class Main {

	// o objeto da classe Scanner esta na variavel de entrada, então é um obj
	// porem o System.in é uma chamada static pq
	// para acessar o in do System nao precisei dar new
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
	byte option;
	do {
	System.out.println(" Escolha uma opção");
	System.out.println("0- Sair ");
	System.out.println("1- Classes");
	System.out.println("2- Herança");
	option = input.nextByte();

	switch(option) {
	case 0:
	System.out.println("Saindo...");
	break;
	case 1:
	aprenderClassesObjetos();
	break;
	case 2:
	aprendendoHeranca();
	break;
	default:
	break;
	}

	}while(option!=0);

	}

	 public static void aprenderClassesObjetos() {

		 
		 Funcionario funcionario1 = new Funcionario();
		 Funcionario funcionario2 = new Funcionario("Cristian",(byte) 19, "Programador Jr", 1500.00f);
		 
		 Diretor diretor1 = new Diretor();
		 diretor1.realizarApresentacao();
		 
		 Diretor diretor2 = new Diretor();
		 diretor2.realizarApresentacao();
		 
		 Diretor diretor3 = new Diretor("Paulo",(byte) 80);
		 diretor3.realizarApresentacao();
		 
	 Professor professorJava = new Professor();

	 Professor professoraIngles = new Professor("Isabelle", (byte) 30);

	 System.out.println("Nome dela = " + professoraIngles.getNome());

	 professoraIngles.setNome("Isabelle 2");

	 System.out.println("agora o nome dela = " + professoraIngles.getNome());
	System.out.println("A idade dela é " + professoraIngles.getIdade());

	 System.out.println("Os professoes trabalham na " + Professor.instituicao);

	 Aluno alunoTeste = new Aluno();

	 Aluno outroAluno = new Aluno();

	 Aluno alunoNovato = new Aluno();

	 Aluno alunoObjeto;
	professorJava.setNome("oliota");
	alunoObjeto = new Aluno();

	 alunoObjeto.idade = 18;

	 alunoTeste.nome = "Rubem";
	alunoTeste.idade = 33;

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
	* System.out.println("Qual a idade do "+alunoNovato.nome+"?");
	* alunoNovato.idade=entrada.nextByte();
	*
	* System.out.println("Bem vindo "+alunoNovato.nome);
	*/

	 }
	public static void aprendendoHeranca() {
	}

	}