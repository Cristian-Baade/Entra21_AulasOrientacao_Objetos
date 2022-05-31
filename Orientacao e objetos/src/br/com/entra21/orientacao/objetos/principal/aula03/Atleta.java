package br.com.entra21.orientacao.objetos.principal.aula03;

public class Atleta {

	private String nome;
	private byte idade;
	private int quantidadeVitorias;
	private int quantidadeDerrotas;

	public Atleta() {

	}

	public Atleta(String nome, byte age, int qtdWin, int qtdLoss) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.quantidadeVitorias = qtdWin;
		this.quantidadeDerrotas = qtdLoss;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getAge() {
		return idade;
	}

	public void setAge(byte age) {
		this.idade = idade;
	}

	public int getQtdWin() {
		return quantidadeVitorias;
	}

	public void setQtdWin(int qtdWin) {
		this.quantidadeVitorias = qtdWin;
	}

	public int getQtdLoss() {
		return quantidadeDerrotas;
	}

	public void setQtdLoss(int qtdLoss) {
		this.quantidadeDerrotas = qtdLoss;
	}

	public void comemorarVitoria() {
		System.out.println("Obrigado Deus pela vitória!");
		this.quantidadeVitorias++;
	}

	public void aprenderComDerrota() {
		System.out.println("Vou melhorar na proxima vez");
		this.quantidadeDerrotas++;
	}

}