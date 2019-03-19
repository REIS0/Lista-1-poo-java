package exercicio2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Comparador comparador = new Comparador();
		
		System.out.print("primeiro numero: ");
		comparador.setAtributo1(input.nextInt());
		System.out.print("segundo numero: ");
		comparador.setAtributo2(input.nextInt());
		System.out.print("terceiro numero: ");
		comparador.setAtributo3(input.nextInt());
		
		System.out.println("maior: " + comparador.getMaior());
		
		input.close();
	}

}
