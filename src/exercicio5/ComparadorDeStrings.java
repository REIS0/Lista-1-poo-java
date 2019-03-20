package exercicio5;

public class ComparadorDeStrings {

	public boolean compararStrings(String string1, String string2) {
		
		if (string1.length() == string2.length()) {
			int count = string2.length() - 1;
			for (int i = 0; i < string1.length(); i++) {
				if (string1.charAt(i) != string2.charAt(count)) {
					return false;
				}
				count--;
			}
			return true;
		}
		else {
			return false;
		}

	}
	
}
