package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public double somar(double a, double b) {
		return a + b;
	}
	
	public double subtrair(double a, double b) {
		return a - b;
	}
	
	public double multiplicar(double a, double b) {
		return a * b;
	}
	
	public double dividir(double a, double b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		System.out.print("primeiro numero: ");
		int a = input.nextInt();
		System.out.print("segundo numero: ");
		int b = input.nextInt();
		
		System.out.println("Selecionar");
		System.out.println("somar[+]  subtrair[-]  multipliciar[*]  dividir[/]");
		char select = input.next().charAt(0);
		
		if (select == '+') {
			System.out.println(calculadora.somar(a, b));
		}
		if (select == '-') {
			System.out.println(calculadora.subtrair(a, b));
		}
		if (select == '*') {
			System.out.println(calculadora.multiplicar(a, b));
		}
		if (select == '/') {
			System.out.println(calculadora.dividir(a, b));
		}
		
		input.close();
		
	}
	
}
