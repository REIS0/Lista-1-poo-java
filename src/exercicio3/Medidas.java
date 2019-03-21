package exercicio3;

import java.util.Objects;

public class Medidas {

	private String unidadeDeDistancia;
	private double distancia;
	private String unidadeDeMassa;
	private double massa;
	private String unidadeDeTemperatura;
	private int temperatura;
	
	public Medidas(){
		
	}
	
	public Medidas(String unidadeDeDistancia, double distancia, String unidadeDeMassa, double massa, String unidadeDeTemperatura, int temperatura) {
		if (Objects.equals(unidadeDeDistancia, "km") || Objects.equals(unidadeDeDistancia, "mi")) {
			this.setUnidadeDeDistancia(unidadeDeDistancia);
		}
		if (Objects.equals(unidadeDeMassa, "kg") || Objects.equals(unidadeDeMassa, "lb")) {
			this.setUnidadeDeMassa(unidadeDeMassa);
		}
		if (Objects.equals(unidadeDeTemperatura, "C") || Objects.equals(unidadeDeTemperatura, "F")) {
			this.setUnidadeDeTemperatura(unidadeDeTemperatura);
		}
		this.setDistancia(distancia);
		this.setMassa(massa);
		this.setTemperatura(temperatura);
	}
	
	public String getUnidadeDeDistancia() {
		return this.unidadeDeDistancia;
	}
	
	public void setUnidadeDeDistancia(String unidadeDeDistancia) {
		this.unidadeDeDistancia = unidadeDeDistancia;
	}
	
	public double getDistancia() {
		return this.distancia;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public String getUnidadeDeMassa() {
		return this.unidadeDeMassa;
	}
	
	public void setUnidadeDeMassa(String unidadeDeMassa) {
		this.unidadeDeMassa = unidadeDeMassa;
	}
	
	public double getMassa() {
		return this.massa;
	}
	
	public void setMassa(double massa) {
		this.massa = massa;
	}
	
	public String getUnidadeDeTemperatura() {
		return this.unidadeDeTemperatura;
	}
	
	public void setUnidadeDeTemperatura(String unidadeDeTemperatura) {
		this.unidadeDeTemperatura = unidadeDeTemperatura;
	}
	
	public int getTemperatura() {
		return this.temperatura;
	}
	
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
}
