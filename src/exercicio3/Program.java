package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		ConversorDeMedidas conversor = new ConversorDeMedidas();
		
		System.out.print("unidade distancia 1 [m/mi]: ");
		String unidadeDeDistancia1 = input.nextLine();
		System.out.print("distancia1: ");
		double distancia1 = input.nextDouble();
		System.out.print("unidade massa 1 [kg/lb]: ");
		input.nextLine();
		String unidadeDeMassa1 = input.nextLine();
		System.out.print("massa: ");
		double massa1 = input.nextDouble();
		System.out.print("unidade temperatura 1: ");
		input.nextLine();
		String unidadeDeTemperatura1 = input.nextLine();
		System.out.print("temperatura: ");
		int temperatura1 = input.nextInt();
		
		System.out.print("unidade distancia 2 [m/mi]: ");
		String unidadeDeDistancia2 = input.nextLine();
		System.out.print("distancia1: ");
		double distancia2 = input.nextDouble();
		System.out.print("unidade massa 2 [kg/lb]: ");
		input.nextLine();
		String unidadeDeMassa2 = input.nextLine();
		System.out.print("massa: ");
		double massa2 = input.nextDouble();
		System.out.print("unidade temperatura 2: ");
		input.nextLine();
		String unidadeDeTemperatura2 = input.nextLine();
		System.out.print("temperatura: ");
		int temperatura2 = input.nextInt();
		
		input.close();

	}

}
