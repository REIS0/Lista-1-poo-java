package exercicio4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite numero: ");
		Estatistica estatistica = new Estatistica(input.nextInt());
		
		System.out.println("somatorio[s] media[m] imprimir[i]");
		System.out.print("escolha opcao: ");
		char escolha = input.next().charAt(0);
		
		if (escolha == 's') {
			System.out.println("somatorio: " + estatistica.somatorio());
		}
		else if (escolha == 'm') {
			System.out.println("media: " + estatistica.media());
		}
		else if (escolha == 'v') {
			System.out.println("variancia: " + estatistica.variancia());
		}
		else if (escolha == 'i') {
			estatistica.imprimir();
		}
		else {
			System.out.println("escolha invalida");
		}
		
		input.close();

	}

}
