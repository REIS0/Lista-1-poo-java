package exercicio3;

public class ConversorDeMedidas {

	public String converterMassa(Medidas medidas1, Medidas medidas2) {
		if (medidas1.getUnidadeDeMassa() == "kg" && medidas2.getUnidadeDeMassa() == "lb") {
			return ((medidas1.getMassa()*2.2046) + " lb");
		}
		else if (medidas1.getUnidadeDeMassa() == "lb" && medidas2.getUnidadeDeMassa() == "kg") {
			return ((medidas1.getMassa()/2.2046) + " kg");
		}
		else {
			return "nao e possivel, medidas iguais";
		}
	}
	
	public String converterTemperatura(Medidas medidas1, Medidas medidas2) {
		if (medidas1.getUnidadeDeTemperatura() == "C" && medidas2.getUnidadeDeTemperatura() == "F") {
			return ((medidas1.getTemperatura()*1.8+32) + " F");
		}
		else if (medidas2.getUnidadeDeTemperatura() == "F" && medidas2.getUnidadeDeTemperatura() == "C") {
			return (((medidas1.getTemperatura()+32)/1.8) + " C");
		}
		else {
			return "nao e possivel, medidas iguais";
		}
	}
	
	public String converterDistancia(Medidas medidas1, Medidas medidas2) {
		if (medidas1.getUnidadeDeDistancia() == "m" && medidas2.getUnidadeDeDistancia() == "mi") {
			return ((medidas1.getDistancia()/1609.344) + " mi");
		}
		else if (medidas1.getUnidadeDeDistancia() == "mi" && medidas2.getUnidadeDeDistancia() == "m") {
			return ((medidas1.getDistancia()*1609.344) + " m");
		}
		else {
			return "nao e possivel, medidas iguais";
		}
	}
	
}
