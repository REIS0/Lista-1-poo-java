package exercicio4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite numero: ");
		Estatistica estatistica = new Estatistica(input.nextInt());
		
		System.out.println("somatorio: " + estatistica.somatorio());
		System.out.println("media: " + estatistica.media());
		System.out.println("variancia: " + estatistica.variancia());
		estatistica.imprimir();
		
		input.close();

	}

}
