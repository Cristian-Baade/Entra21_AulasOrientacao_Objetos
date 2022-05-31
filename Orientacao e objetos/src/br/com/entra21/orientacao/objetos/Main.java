package br.com.entra21.orientacao.objetos;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;
import br.com.entra21.orientacao.objetos.principal.aula03.Atleta;
import br.com.entra21.orientacao.objetos.principal.aula03.Gamer;
import br.com.entra21.orientacao.objetos.principal.aula03.Nadador;
import br.com.entra21.orientacao.objetos.principal.aula03.Velocista;
import br.com.entra21.orientacao.objetos.principal.aula04.Ponto;
import br.com.entra21.orientacao.objetos.principal.aula04.Reta;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Aviao;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Capivara;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Gato;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Humano;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Planta;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Sagui;
import br.com.entra21.orientacao.objetos.principal.aula05.Revisao.Revisao;

public class Main {

	// o objeto da classe Scanner esta na variavel de entrada, então é um obj
	// porem o System.in é uma chamada static pq
	// para acessar o in do System nao precisei dar new
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;
		System.out.println("aprendendo sobre orientação a objetos");

		do {
			System.out.println("Escolha uma opção");
			System.out.println("0 - Sair");
			System.out.println("1 - Classes e objetos");
			System.out.println("2 - Herança");
			System.out.println("3 - Polimorfismo");
			System.out.println("4 - Aprender conceitos POO");
			System.out.println("5 - Aprender Polimorfismo com interface");
			System.out.println("6 - Revisão");
			opcao = entrada.nextByte();

			switch (opcao) {

			case 0:
				System.out.println("Saindo");
				break;
			case 1:
				aprenderClasses();
				break;
			case 2:
				aprenderHeranca();
				break;
			case 3:
				aprenderPolimorfismo();
				break;
			case 4:
				aprenderConceitosPOO();
				break;
			case 5:
				aprenderPolimorfismoInterface();
				break;
			case 6:
				revisarPOO();
				break;
			default:
				break;
			}

		} while (opcao != 0);

	}

	private static void aprenderClasses() {

		// instanciando um objeto da classe Professor na variavel professorJava
		Professor professorJava = new Professor();

		// instanciando um objeto da classe Professor na variavel professoraIngles
		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		// Acessando os atributos com encapsulamento
		System.out.println("Nome dela = " + professoraIngles.getNome());
		professoraIngles.setNome("Isabelle 2");
		System.out.println("agora o nome  dela = " + professoraIngles.getNome());
		System.out.println("A idade dela é " + professoraIngles.getIdade());

		// Acessando o atributo estático da Classe Professor, atributos estáticos ou
		// metodos estatico não pertencem aos objetos da Classe
		// dessa forma é possivel acessar em a necessidade de criar um objeto com new
		System.out.println("Os professoes trabalham na " + Professor.instituicao);

		// Criando varios objetos da classe Aluno nas variaveis
		// cada variavel é independente e possui seus atributos e metodos
		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		Aluno alunoObjeto;
		alunoObjeto = new Aluno();

		// as alterações aqui só afetam esse objeto
		alunoObjeto.idade = 18;

		// as alterações aqui só afetam esse objeto
		alunoTeste.nome = "Rubem";
		alunoTeste.idade = 33;

		// as alterações aqui só afetam esse objeto
		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";

		// Executando varias vezes o metodo desse objeto
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		// Interagindo com o usuario para preencher os atributos do Aluno que ainda não
		// tem encapsulamento
		System.out.println("Qual o nome do aluno novato?");
		alunoNovato.nome = entrada.next();

		System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		alunoNovato.idade = entrada.nextByte();

		System.out.println("Bem vindo " + alunoNovato.nome);

	}

	private static void aprenderHeranca() {
		Pessoa pessoa1 = new Pessoa();

		Diretor diretor1 = new Diretor("Paulo", (byte) 80, "08938491212", "Entra21", (byte) 10);
		diretor1.setNome("Paulo");

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setIdade((byte) 22);
		funcionario1.setObservacao("novato");

		Funcionario funcionario2 = new Funcionario("Fulano", (byte) 18, "07821199901", "Junin", 4000.05f);
		funcionario2.getCpf();

	}

	private static void aprenderPolimorfismo() {
		Atleta cr7 = new Atleta();
		cr7.comemorarVitoria();
		cr7.aprenderComDerrota();

		System.out.println("----------------------------");
		
		Nadador michaelPhelps = new Nadador();
		michaelPhelps.setNome("Michael Phelps");
		Nadador sergioMichael = new Nadador("Sérgio Michael", (byte) 39, 23, 40, "Piscína", "Sunga e Touca");
		sergioMichael.comemorarVitoria(); // procura primeiro na minha classe Nadador, como o método com polimorfismo não foi acionado com o envio de uma frase, usara o metodo da herança.
		michaelPhelps.comemorarVitoria(); // procura primeiro na minha classe Nadador, como o método com polimorfismo não foi acionado com o envio de uma frase, usara o metodo da herança.
		
		sergioMichael.agradecerVitoria(" Foi árduo, mas consegui!"); // Enviando uma frase, acessar o metodo com polimorfismo na classe Nadador e apresenta a frase enviada.
		sergioMichael.agradecerVitoria(""); // Enviando frase vazia, acessar o metodo com polimorfismo na classe Nadador e apresenta a frase redundante
		
		System.out.println("----------------------------");

		Velocista usainBolt = new Velocista();
		usainBolt.setNome("Usain Bolt");
		usainBolt.comemorarVitoria();

		System.out.println("----------------------------");
	}

	private static void aprenderConceitosPOO() {
		// A classe ponto tem alta COESÃO pos é preciso nas suas responsabilidades
		Ponto pontoAlto = new Ponto(30, 10000);
		Ponto esquerdaBaixo = new Ponto(-50, -500);
		// A classe reta é AGREGADA por pontos que podem não estar inicializados.
		// A asociação de reta e ponto e de um para muitos respectivamente
		Reta torta = new Reta();
		Reta retaDiagonal = new Reta(pontoAlto, esquerdaBaixo);

		System.out.println(
				"O ponto representado em esquerdaBaixo tem a corrdenada X em: " + esquerdaBaixo.getCoordenadaX());

	}

	private static void aprenderPolimorfismoInterface() {

		Humano pessoa = new Humano();
		pessoa.setNome("Fulano");
		pessoa.alimentar("macarrão");
		pessoa.alimentar("arroz");
		pessoa.comunicar("Boa noite, interface é muito fácil");
		pessoa.locomover();

		Gato vezu = new Gato();
		vezu.alimentar("peixe");
		vezu.alimentar("ração");
		vezu.comunicar("Será que existem gatos programadores?");
		vezu.locomover();

		Sagui jubileu = new Sagui();
		jubileu.alimentar("Fruta");
		jubileu.alimentar("Banana");
		jubileu.comunicar("Grita loucamente");
		jubileu.locomover();

		Aviao comercial = new Aviao();
		comercial.setModelo("Boeing 737");
		System.out.println(comercial.freiar());
		comercial.acelerar(870.5f);
		System.out.println(comercial.getVelocidadeAtual());

	}

	private static void revisarPOO() {
		Revisao.revisar();
	}
}