package exercicio4;

public class Estatistica {
	
	private int maiorValor;

	public Estatistica(int atributo) {
		this.maiorValor = atributo;
	}
	
	public int somatorio() {
		int contador = 0;
		int soma = maiorValor;
		while (contador < maiorValor) {
			soma += contador;
			contador++;
		}
		return soma;
	}
	
	public double media() {
		int contador = 0;
		int soma = maiorValor;
		while (contador < maiorValor) {
			soma += maiorValor;
			contador++;
		}
		return soma/maiorValor;
	}
	
	public void imprimir() {
		for (int contador = 0; contador <= maiorValor; contador++) {
			if (contador%2 == 0) {
				System.out.println(contador + " e par");
			}
			else {
				System.out.println(contador + " e impar");
			}
		}
	}
	
}
