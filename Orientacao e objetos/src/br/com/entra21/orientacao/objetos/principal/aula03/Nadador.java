package br.com.entra21.orientacao.objetos.principal.aula03;

public class Nadador extends Atleta {

	private String modalidade;
	private String ambienteAquatico;
	private String equipamentosAquaticos;
	
	public Nadador() {

	}

	public Nadador(String ambienteAquatico, String equipamentosAquaticos) { // Construtor com meus atributos da classe
		super();
		this.ambienteAquatico = ambienteAquatico;
		this.equipamentosAquaticos = equipamentosAquaticos;
	}

	public Nadador(String name, byte age, int qtdWin, int qtdLoss, String ambienteAquatico,
			String equipamentoAquatico) { // construtor com meus atributos da classe Nadador também atributos da minha
											// super-Classe Atleta
		super(name, age, qtdWin, qtdLoss);
		this.ambienteAquatico = ambienteAquatico;
		this.equipamentosAquaticos = equipamentoAquatico;
	}

	public String getAmbienteAquatico() {
		return ambienteAquatico;
	}

	public void setAmbienteAquatico(String ambienteAquatico) {
		this.ambienteAquatico = ambienteAquatico;
	}

	public String getEquipamentosAquaticos() {
		return equipamentosAquaticos;
	}

	public void setEquipamentosAquaticos(String equipamentosAquaticos) {
		this.equipamentosAquaticos = equipamentosAquaticos;
	}

	// comemorar vitória já existe na super-Classe
	// mas se eu criar com o mesmo nome visibilidade, tipo de retorno e argumentos
	// o método escolhido será esse aqui, não o da super-Classe

	public void agradecerVitoria(String frase) {
		setQtdWin(getQtdWin() + 1);
		System.out.println(getNome() + (frase.isEmpty() ? " comemora batendo as mãos na água" : frase));
		// isEmpty testa se a string tem zero caracteres.
	}

}