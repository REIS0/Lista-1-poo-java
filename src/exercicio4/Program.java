package exercicio4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite numero: ");
		Estatistica estatistica = new Estatistica(input.nextInt());
		
		System.out.println("somatorio[s] media[m] imprimir[i]");
		System.out.print("escolha opção: ");
		char escolha = input.next().charAt(0);
		
		if (escolha == 's') {
			System.out.println("somatorio: " + estatistica.somatorio());
		}
		if (escolha == 'm') {
			System.out.println("media: " + estatistica.media());
		}
		if (escolha == 'i') {
			estatistica.imprimir();
		}
		else {
			System.out.println("escolha invalida");
		}
		
		input.close();

	}

}
