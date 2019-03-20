package exercicio5;

public class ComparadorDeStrings {

	public boolean compararStrings(String string1, String string2) {
		String reverse1;
		String reverse2;
		for (int i = string1.length(); i >= 0; i--) {
			reverse1 += string1.charAt(i);
		}
		for (int i = string2.length(); i >= 0; i--) {
			reverse2 += string2.charAt(i);
		}
		
		if (string1 == reverse2 || string2 == reverse1) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
