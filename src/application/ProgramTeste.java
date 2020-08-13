package application;

import java.io.ObjectInputStream.GetField;
import java.util.Locale;
import java.util.Scanner;

import entities.EsquadriaCorrer;
import entities.tipos.Correr2F;

public class ProgramTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Largura (cm): ");
		double largura = sc.nextDouble();
		System.out.print("Altura (cm): ");
		double altura = sc.nextDouble();
		
		System.out.print("Com tela mosquiteira (S/N): ");
		String tela = sc.next();
		boolean telaTeste=false;
		double marco=0;
		
		System.out.print("Lado ativa: ");
		String ativa = sc.next();
		System.out.print("Soleira embutida (S/N): ");
		String soleira = sc.next();
		boolean soleiraTeste = false;
		if(soleira == "S" || soleira == "s") {
			soleiraTeste = true;
		}
		System.out.print("Guarnição para dois lados (S/N): ");
		String guarnicao = sc.next();
		boolean guarnicaoTeste = false;
		if(guarnicao == "S" || guarnicao == "s") {
			guarnicaoTeste = true;
		}

		Correr2F e1 = new Correr2F(largura, altura, marco, soleiraTeste, guarnicaoTeste, telaTeste, ativa);
		
		System.out.println();
		System.out.print(e1.correr2F());		
		sc.close();
	}
	
	/*public static double marcoMinimo(boolean tela) {
		if(tela) {
			return getMarcoMinimo() + Correr2F.getAdicionalMarcoTela1F();
		}
		else {
			return Correr2F.getMarcoMinimo();
		}
	}*/

}
