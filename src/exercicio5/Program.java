package exercicio5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ComparadorDeStrings comparador = new ComparadorDeStrings();
		
		System.out.print("primeira palavra: ");
		String string1 = input.nextLine();
		System.out.print("segunda palavra: ");
		String string2 = input.nextLine();
		
		System.out.println(comparador.compararStrings(string1, string2));
		
		if (comparador.compararStrings(string1, string2) == true) {
			System.out.println("reverso");
		}
		else {
			System.out.println("nao reverso");
		}
		
		input.close();

	}

}
