package exercicio3;

import java.util.Objects;

public class ConversorDeMedidas {

	public String converterMassa(Medidas medidas1, Medidas medidas2) {
		if (Objects.equals(medidas1.getUnidadeDeMassa(), "kg") && Objects.equals(medidas2.getUnidadeDeMassa(), "lb")) {
			return ((medidas1.getMassa()*2.2046) + " lb");
		}
		else if (Objects.equals(medidas1.getUnidadeDeMassa(), "lb") && Objects.equals(medidas2.getUnidadeDeMassa(), "kg")) {
			return ((medidas1.getMassa()/2.2046) + " kg");
		}
		else {
			return "nao e possivel, medidas iguais";
		}
	}
	
	public String converterTemperatura(Medidas medidas1, Medidas medidas2) {
		if (Objects.equals(medidas1.getUnidadeDeDistancia(), "C") && Objects.equals(medidas2.getUnidadeDeTemperatura(), "F")) {
			return ((medidas1.getTemperatura()*1.8+32) + " F");
		}
		else if (Objects.equals(medidas1.getUnidadeDeDistancia(), "F") && Objects.equals(medidas2.getUnidadeDeTemperatura(), "C")) {
			return (((medidas1.getTemperatura()+32)/1.8) + " C");
		}
		else {
			return "nao e possivel, medidas iguais";
		}
	}
	
	public String converterDistancia(Medidas medidas1, Medidas medidas2) {
		if (Objects.equals(medidas1.getUnidadeDeDistancia(), "km") && Objects.equals(medidas2.getUnidadeDeDistancia(), "mi")) {
			return ((medidas1.getDistancia()/1.609) + " mi");
		}
		else if (Objects.equals(medidas1.getUnidadeDeDistancia(), "mi") && Objects.equals(medidas2.getUnidadeDeDistancia(), "km")) {
			return ((medidas1.getDistancia()*1.609) + " km");
		}
		else {
			return "nao e possivel, medidas iguais";
		}
	}
	
}
