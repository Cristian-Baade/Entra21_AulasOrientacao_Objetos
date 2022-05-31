package br.com.entra21.orientacao.objetos.principal.aula03;

public class Velocista extends Atleta {

	private String tipoPista;
	private String marcaCalcado;

	public Velocista() {
		super();
	}

	public Velocista(String tipoPista, String marcaCalcado) {
		super();
		this.tipoPista = tipoPista;
		this.marcaCalcado = marcaCalcado;
	}

	public String getTipoPista() {
		return tipoPista;
	}

	public void setTipoPista(String tipoPista) {
		this.tipoPista = tipoPista;
	}

	public String getMarcaCalcado() {
		return marcaCalcado;
	}

	public void setMarcaCalcado(String marcaCalcado) {
		this.marcaCalcado = marcaCalcado;
	}

	@Override
	public void comemorarVitoria() {
		super.comemorarVitoria();

		System.out.println(getNome() + " aaaaa estou cansado mais corri para vitória. (frases inspiradoras)");
	}

}