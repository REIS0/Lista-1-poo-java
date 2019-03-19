package exercicio2;

public class Comparador {
	
	private int atributo1;
	private int atributo2;
	private int atributo3;
	
	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}
	
	public int getAtributo1() {
		return this.atributo1;
	}
	
	public void setAtributo2(int atributo2) {
		this.atributo2 = atributo2;
	}
	
	public int getAtributo2() {
		return this.atributo2;
	}
	
	public void setAtributo3(int atributo3) {
		this.atributo3 = atributo3;
	}
	
	public int getAtributo3() {
		return this.atributo3;
	}
	
	public int getMaior() {
		if(this.atributo1>=this.atributo2 && this.atributo1<=this.atributo3) {
			return this.atributo1;
		}
		if (this.atributo2>=this.atributo1 && this.atributo2>=this.atributo3) {
			return this.atributo2;
		}
		else {
			return this.atributo3;
		}
	}
	
}
