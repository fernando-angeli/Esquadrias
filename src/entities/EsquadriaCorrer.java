package entities;

public class EsquadriaCorrer {
	
	protected double largura;
	protected double altura;
	protected double marco;
	protected boolean soleiraEmbutida;
	protected boolean guarnicaoExterna;
	protected boolean tela;
	
	public EsquadriaCorrer() {
	}

	public EsquadriaCorrer(double largura, double altura, double marco, boolean soleiraEmbutida, boolean guarnicaoExterna, boolean tela) {
		this.largura = largura;
		this.altura = altura;
		this.marco = marco;
		this.soleiraEmbutida = soleiraEmbutida;
		this.guarnicaoExterna = guarnicaoExterna;
		this.tela = tela;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getMarco() {
		return marco;
	}

	public void setMarco(double marco) {
		this.marco = marco;
	}

	public boolean isSoleiraEmbutida() {
		return soleiraEmbutida;
	}

	public void setSoleiraEmbutida(boolean soleiraEmbutida) {
		this.soleiraEmbutida = soleiraEmbutida;
	}

	public boolean isGuarnicaoExterna() {
		return guarnicaoExterna;
	}

	public void setGuarnicaoExterna(boolean guarnicaoExterna) {
		this.guarnicaoExterna = guarnicaoExterna;
	}
	
	//implementar lógica
	public double larguraMontanteCorrer() {
		double larguraMontanteCorrer = 8;
		return larguraMontanteCorrer;
	}
	
	public double largura2Folhas() {
		double larguraFolha = ((largura-larguraMontanteCorrer())/2)+(larguraMontanteCorrer()/2);
		return larguraFolha;
	}
	
	//implementar largura3Folhas, 4Folhas, 6Folhas, etc
	
	//lógica para todas alturas de correr
	public double alturaFolha() {
		double alturaFolha = altura-(2*espessuraMarco+folgaSuperior+folgaInferior);
		return alturaFolha;
	}
	
	final double folgaSuperior = 1.8;
	final double folgaInferior = 0.3;
	final double espessuraMarco = 3.1;
	final double espessuraGuarnicao = 1.4;
	final double larguraGuarnicao = 6.5;
	final double espessuraFilete = 0.8;
	final double larguraFilete = 2.5;
	final double espessuraMontanteCorrer = 4.2;

	public double getEspessuraGuarnicao() {return espessuraGuarnicao;}
	public double getLarguraGuarnicao() {return larguraGuarnicao;}
	public double getEspessuraFilete() {return espessuraFilete;}
	public double getLarguraFilete() {return larguraFilete;}
	public double getEspessuraMontanteCorrer() {return espessuraMontanteCorrer;}
	
}
