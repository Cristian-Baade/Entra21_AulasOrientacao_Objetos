package br.com.entra21.orientacao.objetos.principal.aula05.Revisao;

public interface comportamentosAcademicos {
	// deve ser publico pois o objetivo � as classes terem acesso
	// neste caso, retorna uma String
	// que pode ser aproveitado em um syso, alimentar variaveis, participar de um
	// calculo

	public String realizarApresentacao();

//retorna uma String e precisa de um parametro recebido como argumento.

	public String gerarDossie(String nome);

}