package entities.tipos;

import entities.EsquadriaCorrer;

public class Correr2F extends EsquadriaCorrer {
	
	private String ladoAtiva;
	private double marcoMinimo;
	private double marcoMinimoTela;
	
	public Correr2F() {
	}

	public Correr2F(double largura, double altura, double marco, boolean soleiraEmbutida, boolean guarnicaoExterna, boolean tela, String ladoAtiva) {
		super(largura, altura, marco, soleiraEmbutida, guarnicaoExterna, tela);
		this.ladoAtiva = ladoAtiva;
	}

	public double getMarcoMinimo() {return marcoMinimo;}
	
	public double getMarcoMinimoTela() {return getAdicionalMarcoTela1F();
	}

	public String getLadoAtiva() {
		return ladoAtiva;
	}
	
	//implementar lógica para calculo do montante
	public double larguraMontante(double largura, double altura) {
		double larguraMontante = 8;
		
		return larguraMontante;
	}
	
	public String correr2F() {
		return  "Medidas: " + largura + " x " + altura + " - Marco: "+ marco + " - Lado Ativa: "+ ladoAtiva
				+ "\nFolhas: " + largura2Folhas() + " x " + alturaFolha()
				+ "\n"+marcoMinimoTela;
	}

}
