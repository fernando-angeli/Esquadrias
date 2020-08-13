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
		double marco;
		boolean telaTeste = false;
		boolean soleiraTeste = false;
		boolean guarnicaoTeste = false;
		
		System.out.print("Largura (cm): ");
		double largura = sc.nextDouble();
		System.out.print("Altura (cm): ");
		double altura = sc.nextDouble();
		
		System.out.print("Com tela mosquiteira (S/N): ");
		char tela = sc.next().charAt(0);
		if(tela == 's' || tela == 'S') {
			telaTeste = true;
			System.out.print("Marco (cm): ");
			marco = sc.nextDouble();
			if(marco < Correr2F.getMarcoMinimoTela()) {
				System.out.println("Marco mínimo com tela é de " + Correr2F.getMarcoMinimoTela()+"cm, o preenchimento será automático.");
				marco = Correr2F.getMarcoMinimoTela();
			}
		}
		else {
			System.out.print("Marco (cm): ");
			marco = sc.nextDouble();
			if(marco < Correr2F.getMarcoMinimo()) {
				System.out.println("Marco mínimo é de "+Correr2F.getMarcoMinimo()+"cm, o preenchimento será automático.");
				marco = Correr2F.getMarcoMinimo();
			}
		}
		
		System.out.print("Lado ativa: ");
		String ativa = sc.next();
		System.out.print("Soleira embutida (S/N): ");
		char soleira = sc.next().charAt(0);
		if(soleira == 'S' || soleira == 's') {
			soleiraTeste = true;
		}
		System.out.print("Guarnição para dois lados (S/N): ");
		char guarnicao = sc.next().charAt(0);
		if(guarnicao == 'S' || guarnicao == 's') {
			guarnicaoTeste = true;
		}

		Correr2F e1 = new Correr2F(largura, altura, marco, soleiraTeste, guarnicaoTeste, telaTeste, ativa);
		
		System.out.println();
		System.out.print(e1.correr2F());		
		sc.close();
	}
}
