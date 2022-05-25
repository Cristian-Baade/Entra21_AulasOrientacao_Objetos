package br.com.entra21.orientacao.objetos.principal.heranca;

public class Diretor {

	private String nome;
	private byte idade;
	private String cursoAtual;
	private byte quantidadeProfessores;

	public Diretor() {

	}

	public Diretor(String nome, byte idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void realizarApresentacao() {
		System.out.println("Oi meu nome é "+this.nome+ " e tenho "+this.idade+" Anos");
	}
}
