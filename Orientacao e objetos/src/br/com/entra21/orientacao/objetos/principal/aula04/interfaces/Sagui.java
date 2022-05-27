package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Sagui implements Individuo {

	@Override
	public void alimentar(String alimento) {
		
		System.out.println("O sagui come Banana,frutos e "+alimento);
		
	}

	@Override
	public void locomover() {
		
		System.out.println("O sagui anda,corre e pula");
		
	}

	@Override
	public void comunicar(String conteudo) {
		
		System.out.println("Um sagui só grita mesmo");
		
	}

}
