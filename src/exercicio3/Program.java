package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		ConversorDeMedidas conversor = new ConversorDeMedidas();
		Medidas medidas1 = new Medidas();
		Medidas medidas2 = new Medidas();
		
		System.out.print("unidade distancia 1 [km/mi]: ");
		medidas1.setUnidadeDeDistancia(input.next());
		System.out.print("distancia1: ");
		medidas1.setDistancia(input.nextDouble());
//		System.out.print("unidade massa 1 [kg/lb]: ");
//		input.nextLine();
//		String unidadeDeMassa1 = input.nextLine();
//		System.out.print("massa: ");
//		double massa1 = input.nextDouble();
//		System.out.print("unidade temperatura 1: ");
//		input.nextLine();
//		String unidadeDeTemperatura1 = input.nextLine();
//		System.out.print("temperatura: ");
//		int temperatura1 = input.nextInt();
		
		System.out.print("unidade distancia 2 [km/mi]: ");
		medidas2.setUnidadeDeDistancia(input.next());
		System.out.print("distancia2: ");
		medidas2.setDistancia(input.nextDouble());
//		System.out.print("unidade massa 2 [kg/lb]: ");
//		input.nextLine();
//		String unidadeDeMassa2 = input.nextLine();
//		System.out.print("massa: ");
//		double massa2 = input.nextDouble();
//		System.out.print("unidade temperatura 2: ");
//		input.nextLine();
//		String unidadeDeTemperatura2 = input.nextLine();
//		System.out.print("temperatura: ");
//		int temperatura2 = input.nextInt();
		
		System.out.println(conversor.converterDistancia(medidas1, medidas2));
		
		input.close();

	}

}
