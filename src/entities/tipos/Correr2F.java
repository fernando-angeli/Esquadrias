package entities.tipos;

import entities.EsquadriaCorrer;

public class Correr2F extends EsquadriaCorrer {

	private String ladoAtiva;

	public Correr2F() {
	}

	public Correr2F(int quantidade, double largura, double altura, double marco, boolean soleiraEmbutida,
			boolean guarnicaoExterna, boolean tela, String ladoAtiva) {
		super(quantidade, largura, altura, marco, soleiraEmbutida, guarnicaoExterna, tela);
		this.ladoAtiva = ladoAtiva;
	}

	public static double getMarcoMinimo() {
		return 11;
	}

	public static double getMarcoMinimoTela() {
		return 16;
	}

	public String getLadoAtiva() {
		return ladoAtiva;
	}

	public String folhasComTela() {
		return "\n--- Relatório das folhas de correr com telas ---\n" + "--- " + getEspessuraMontanteCorrer() + " x "
				+ larguraMontanteCorrer() + " ---\n" + 6 * quantidade + " pçs. " + largura2Folhas() + " - horizontal\n"
				+ 6 * quantidade + " pçs. " + alturaFolha() + " - vertical";
	}

	public String correr2F() {
		return "Medidas: " + largura + " x " + altura + " - Marco: " + marco + " - Lado Ativa: " + ladoAtiva + "\n"
				+ "Folhas: " + largura2Folhas() + " x " + alturaFolha() + "\n"
				+ "\n--- Relatório das folhas de correr ---\n" + "--- " + getEspessuraMontanteCorrer() + " x "
				+ larguraMontanteCorrer() + " ---\n" + 4 * quantidade + " pçs. " + largura2Folhas() + " - horizontal\n"
				+ 4 * quantidade + " pçs. " + alturaFolha() + " - vertical";
	}
	
	public String correr2FcomTela() {
		return "Medidas: " + largura + " x " + altura + " - Marco: " + marco + " - Lado Ativa: " + ladoAtiva + "\n"
				+ "Folhas: " + largura2Folhas() + " x " + alturaFolha() + "\n"
				+ "\n--- Relatório das folhas de correr ---\n" + "--- " + getEspessuraMontanteCorrer() + " x "
				+ larguraMontanteCorrer() + " ---\n" + 6 * quantidade + " pçs. " + largura2Folhas() + " - horizontal\n"
				+ 6 * quantidade + " pçs. " + alturaFolha() + " - vertical";
	}
}