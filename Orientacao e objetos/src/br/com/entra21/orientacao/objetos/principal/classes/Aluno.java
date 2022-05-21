package br.com.entra21.orientacao.objetos.principal.classes;

import java.util.Scanner;

public class Aluno {

//
	public String nome;
	public byte idade;
	public byte quantidadePresencas;

	//
	public Aluno() {//

	}

	public byte responderChamada() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("O aluno " + this.nome + " está ai?");
		String resposta = entrada.next();
		if (resposta.equalsIgnoreCase("sim")) {
			this.quantidadePresencas++;
			//
			//
		}
		return this.quantidadePresencas;
	}
}
